import java.util.Random;
import java.util.Scanner;

public class P07BullsAndCows {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        printIntro();
        int number = generate4DigitsNumberWithoutRepeatingDigits();
        int guess = 0;
        do{
            System.out.println("Your guess(Should be four digits number without matching digits): ");
            guess = sc.nextInt();
        }while(isValidNumber(guess));
        while(guess != number){
            loop();
        }

    }

    public static void printIntro(){
        System.out.println("         Welcome to Bulls And Cows!         ");

        System.out.println(
                "             /)  (\\\n" +
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
    }

    public static int generate4DigitsNumberWithoutRepeatingDigits(){
        Random r = new Random();
        return r.nextInt((9 - 0) + 1) + 0;

    }

    public static boolean isValidNumber(int num){
        if(num >= 1023 && num <= 9876){
            String numStr = "" + num;
            if(numStr.charAt(0) == numStr.charAt(1) || numStr.charAt(0) == numStr.charAt(2) || numStr.charAt(0) == numStr.charAt(3)
            || numStr.charAt(1) == numStr.charAt(2) || numStr.charAt(1) == numStr.charAt(3) || numStr.charAt(2) == numStr.charAt(3)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void loop(){

    }

}
