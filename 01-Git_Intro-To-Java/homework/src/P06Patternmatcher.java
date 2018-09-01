import java.util.Scanner;

public class P06Patternmatcher {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(" ");
        String text = str[0];
        String pattern = str[1];

        if(pattern.contains("?") && pattern.contains("*")){
            String part1 = pattern.split("\\*")[0], part2 = pattern.split("\\*")[1];
            if(part1.contains("?")){
                String newPattern = ChangeQuestionMark(text, part1);
                if(newPattern == part1){
                    System.out.println(false);
                }
                else{
                    System.out.println(text.contains(newPattern) && text.contains(part2));
                }
            }
            else{
                String newPattern = ChangeQuestionMark(text, part2);
                if(newPattern == part2){
                    System.out.println(false);
                }
                else{
                    System.out.println(text.contains(newPattern) && text.contains(part1));
                }
            }
        }
        else if(pattern.contains("?")){
            String newPattern = ChangeQuestionMark(text, pattern);
            if(newPattern == pattern){
                System.out.println(false);
            }
            else{
                System.out.println(text.contains(newPattern));
            }

        }
        else if(pattern.contains("*")){
            try{
                String part1 = pattern.split("\\*")[0], part2 = pattern.split("\\*")[1];
                System.out.println(text.contains(part1) && text.contains(part2));
            }
            catch(IndexOutOfBoundsException e){
                String newPart = pattern.split("\\*")[0];
                System.out.println(text.contains(newPart));
            }
        }
        else{
            System.out.println(text.contains(pattern));
        }
    }

    public static String ChangeQuestionMark(String textToMatch, String pattern){
        String p = pattern.replace("?", "");
        int index = pattern.indexOf("?");
        for(int i = 0; i < textToMatch.length(); i++){
            if(textToMatch.charAt(i) == p.charAt(0)){
                try{
                    pattern = pattern.replace('?', textToMatch.charAt(index == 0 ? i - 1 : i + index));
                }
                catch(StringIndexOutOfBoundsException e){
                    return p;
                }
            }
        }
        return pattern;
    }
}
