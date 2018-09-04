package com.kosta.core;

import com.kosta.exceptions.InvalidNumberException;
import com.kosta.interfaces.IGuesser;

import java.util.Scanner;

public class Guesser implements IGuesser {

    private Number guess;


    public Guesser() {
        guess = null;
    }

    public Number getGuess() {
        return this.guess;
    }

    @Override
    public void makeGuess(Scanner sc) {
        System.out.println("Make a guess (4 digits without duplicate digits): ");
        int guessNum = sc.nextInt();
        if (guessNum == Engine.SURRENDER_CODE) {
            surrender();
        }
        try {
            Number res = new Number(guessNum);
            this.guess = res;
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void surrender() {
        Engine.printOnConsole("You have surrendered! Game Over!");
        System.exit(0);

    }

}
