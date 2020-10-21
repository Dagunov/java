import java.util.Scanner;
import java.util.Arrays;

class lab1{
    public static void main(String [] args){
        System.out.println("Enter your words:");
        Scanner in = new Scanner(System.in);
        String strHigh = in.nextLine();
        String str = strHigh.toLowerCase();
        int wordsNum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ',')
                wordsNum++;
            if(str.charAt(i) == '.'){
                wordsNum++;
                break;
            }
        }
        if(wordsNum > 30){
            System.out.println("Too many words!");
            return;
        }
        String [] wordsUnf = str.split(",", wordsNum);
        String [] words = new String [wordsUnf.length];
        for(int i = 0; i < words.length; i++){
            words[i] = wordsUnf[i].replace(" ", "");
            words[i] = words[i].replace(".", "");
            if(words[i].length() > 5){
                System.out.println(words[i] + " - too many symbols!");
                return;
            }
        }
        Arrays.sort(words);
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}