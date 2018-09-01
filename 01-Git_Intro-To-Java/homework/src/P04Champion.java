import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Champion {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int i = 0;i < input.length;i++){
            nums.add(Integer.parseInt(input[i]));
        }

        HashMap<Integer,Integer> occurences = new HashMap<Integer,Integer>();

        for(int i = 0;i < nums.size();i++){
            if(occurences.containsKey(nums.get(i))){
                int num = occurences.get(nums.get(i));
                num++;
                occurences.put(nums.get(i),num);
            }else{
                occurences.put(nums.get(i),1);
            }
        }
        int max = 0;
        for (int value : occurences.values()) {
            if(value > max){
                max = value;
            }
        }

        ArrayList<Integer> mostFreq = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value == max){
                mostFreq.add(key);
                mostFreq.add(value);
            }
        }

        if(mostFreq.size() == 2){
            System.out.println(mostFreq.get(0) + " " + mostFreq.get(1));
        }else{
            int min = 1000000;
            for(int i = 0;i < mostFreq.size();i+=2){
                if(mostFreq.get(i) < min){
                    min = mostFreq.get(i);
                }

            }
            for(int i = 0;i < mostFreq.size();i+=2){
                if(mostFreq.get(i) == min){
                    System.out.println(mostFreq.get(i) + " " + mostFreq.get(i+1));
                }
            }
        }


    }

}
