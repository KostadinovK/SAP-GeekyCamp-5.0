package com.kosta.core;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public final class Engine {
    public static final int SURRENDER_CODE = 112;

    private Guesser guesser;
    private Computer computer;

    private int tries;
    private boolean gameOver;

    public Engine(Guesser g, Computer c) {
        this.guesser = g;
        this.computer = c;
        this.tries = 0;
        gameOver = false;
    }

    public Guesser getGuesser() {
        return this.guesser;
    }

    public Computer getComputer() {
        return this.computer;
    }

    public int getTries() {
        return this.tries;
    }

    public boolean getGameState() {
        return this.gameOver;
    }

    public void drawIntro() {
        System.out.println("         Welcome to Bulls And Cows!         ");

        System.out.println(
                "                     /)  (\\\n" +
                        "        .-._((,~~.))_.-,\n" +
                        "         `=.   99   ,='\n" +
                        "           / ,o~~o. \\\n" +
                        "          { { .__. } }\n" +
                        "           ) `~~~\\' (\n" +
                        "          /`-._  _\\.-\\\n" +
                        "         /         )  \\\n" +
                        "       ,-X        #   X-.\n" +
                        "      /   \\          /   \\\n" +
                        "     (     )| |  | |(     )\n" +
                        "      \\   / | |  | | \\   /\n" +
                        "       \\_(.-( )--( )-.)_/\n" +
                        "       /_,\\ ) /  \\ ( /._\\\n" +
                        "           /_,\\  /._\\");
        System.out.println();
        System.out.println("Can you guess the number?");
        System.out.println("You can always surrender by entering the surrender number - 112");
    }

    public void gameLoop() {
        computer.generateNumber();
        Scanner input = new Scanner(System.in);
        do {
            do {
                guesser.makeGuess(input);
            } while (!guesser.getGuess().checkIfIsValid(guesser.getGuess().getValue()));

            this.tries++;
            String guessStr = "" + guesser.getGuess().getValue();
            String answerStr = "" + computer.getNumber().getValue();
            for (int i = 0; i < 4; i++) {
                if (guessStr.charAt(i) == answerStr.charAt(i)) {
                    guesser.getGuess().addBull();
                } else if (answerStr.contains(guessStr.charAt(i) + "")) {
                    guesser.getGuess().addCow();
                }
            }
            if (guesser.getGuess().getBulls() == 4) {
                this.gameOver = true;
            } else {
                System.out.println(guesser.getGuess().getCows() + " Cows and " + guesser.getGuess().getBulls() + " Bulls.");
            }
        } while (!this.gameOver);
        System.out.println("You won after " + this.tries + " guesses!");
    }


    public static void printOnConsole(String message) {
        System.out.println(message);
    }

    private boolean hasDupes(int num) {
        boolean[] digs = new boolean[10];
        while (num > 0) {
            if (digs[num % 10]) return true;
            digs[num % 10] = true;
            num /= 10;
        }
        return false;
    }


}
