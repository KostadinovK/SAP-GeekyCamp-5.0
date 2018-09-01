import java.util.Arrays;
import java.util.Scanner;

public class P05Anagrams {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        StringBuilder builder1 = new StringBuilder(input[0].toLowerCase());
        StringBuilder builder2 = new StringBuilder(input[1].toLowerCase());

        for(int i = 0;i < builder1.length();i++){
            if(builder1.charAt(i) < 'a' || builder1.charAt(i) > 'z'){
                builder1.deleteCharAt(i);
            }
        }

        for(int i = 0;i < builder2.length();i++){
            if(builder2.charAt(i) < 'a' || builder2.charAt(i) > 'z'){
                builder2.deleteCharAt(i);
            }
        }

        String word1 = builder1.toString();
        String word2 = builder2.toString();

        word1 = sortString(word1);
        word2 = sortString(word2);

        if(word1.equals(word2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }

    public static String sortString(String input){
        char tempArray[] = input.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
