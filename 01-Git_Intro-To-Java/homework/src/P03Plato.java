import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P03Plato {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int count = 1;
        int max = 0;
        for(int i = 0;i < input.length()-1;i++){
            if(input.charAt(i) == input.charAt(i+1)){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                count = 1;
            }
        }
        if(max > count){
            System.out.println(max);
        }else {
            System.out.println(count);
        }
    }

}
