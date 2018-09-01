import java.util.Scanner;

public class P01Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        boolean invalid = false;
        for(int i = 0;i < input.length();i++){
            if(!invalid){
                for(int j = i+1;j < input.length();j++){
                    if(input.charAt(i) == input.charAt(j)){
                        invalid = true;
                        break;
                    }
                }
            }


        }

        if(invalid){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
