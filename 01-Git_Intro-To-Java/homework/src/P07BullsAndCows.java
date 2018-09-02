import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class P07BullsAndCows {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printIntro();
        playGame();


    }

    public static void printIntro() {
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


    public static void playGame() {
        Random gen = new Random();
        int num = 0;
        while (hasDupes(num = (gen.nextInt(9000) + 1000))) ;
        String numStr = num + "";
        boolean guessed = false;
        Scanner input = new Scanner(System.in);
        int guesses = 0;
        do {
            int bulls = 0;
            int cows = 0;
            System.out.print("Guess a 4-digit number with no duplicate digits: ");
            int guess;
            try {
                guess = input.nextInt();
                if (guess == 112) {
                    System.out.println("You have surrendered, Game Over!");
                    System.exit(0);
                }
                if (hasDupes(guess) || guess < 1000 || guess > 9999) continue;
            } catch (InputMismatchException e) {
                continue;
            }
            guesses++;
            String guessStr = guess + "";
            for (int i = 0; i < 4; i++) {
                if (guessStr.charAt(i) == numStr.charAt(i)) {
                    bulls++;
                } else if (numStr.contains(guessStr.charAt(i) + "")) {
                    cows++;
                }
            }
            if (bulls == 4) {
                guessed = true;
            } else {
                System.out.println(cows + " Cows and " + bulls + " Bulls.");
            }
        } while (!guessed);
        System.out.println("You won after " + guesses + " guesses!");

    }


    public static boolean hasDupes(int num) {
        boolean[] digs = new boolean[10];
        while (num > 0) {
            if (digs[num % 10]) return true;
            digs[num % 10] = true;
            num /= 10;
        }
        return false;
    }


}
