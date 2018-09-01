import java.util.Random;
import java.util.Scanner;

public class P07BullsAndCows {


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        printIntro();
        int number = generate4DigitsNumberWithoutRepeatingDigits();
        int guess = 0;
        int tries = 0;
        do{
            System.out.println("Your guess(Should be four digits number without matching digits): ");
            guess = sc.nextInt();
        }while(isValidNumber(guess));

        if(guess == number){
            System.out.println("Congratulations, you won from the first time!");
        }else{
            System.out.println("Sorry, try again!");
            tries+=2;
            while(true){
                if(guess == 112){
                    System.out.println("You have surrendered!");
                    break;
                }
                do{
                    System.out.printf("Your guess(Try %d)",tries);
                    guess = sc.nextInt();
                }while(isValidNumber(guess));

                if(guess == number){
                    System.out.printf("Congratulations, you won from the %d time!\n",tries);
                    break;
                }else{
                    tries++;
                }
            }

        }


    }

    public static void printIntro(){
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

    public static int generate4DigitsNumberWithoutRepeatingDigits(){

        int d1 = 0,d2 = 0, d3 = 0, d4 = 0;
        do{
            d1 = new Random().nextInt(9+1);
            d2 = new Random().nextInt(9+1);
            d3 = new Random().nextInt(9+1);
            d4 = new Random().nextInt(9+1);
        }while(d1 != d2 && d1 != d3 && d1 != d4 && d2 != d3 && d2 != d4 && d3 != d4);

        String numStr = "" + d1 + "" + d2 + "" + d3 + "" + d4;

        return Integer.parseInt(numStr);
    }

    public static boolean isValidNumber(int num){
        if(num != 112){
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
        }else{
            return true;
        }

    }

}
