import java.util.*;

public class P02HowMany {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        for(int i = 0;i < inputArray.length;i++){
            nums.add(Integer.parseInt(inputArray[i]));
        }

        LinkedHashMap<Integer,Integer> occurences = new LinkedHashMap<Integer,Integer>();

        for(int i = 0;i < nums.size();i++){
            if(occurences.containsKey(nums.get(i))){
                int num = occurences.get(nums.get(i));
                num++;
                occurences.put(nums.get(i),num);
            }else{
                occurences.put(nums.get(i),1);
            }
        }

        ArrayList<Integer> printRes = new ArrayList<Integer>();

        for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            printRes.add(key);
            printRes.add(value);
        }

        for(int i = 0;i < printRes.size();i++){
            if(i == printRes.size()-1){
                System.out.print(printRes.get(i));
            }else{
                System.out.print(printRes.get(i) + " ");
            }
        }
        System.out.println();

    }

}
