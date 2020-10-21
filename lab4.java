import java.util.*;

class lab4{
    public static void main(String [] args){
        System.out.println("Enter your words:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        System.out.println(iter(str.split("[ .,!?]")));
        System.out.println(rec(str.split("[ .,!?]")));
    }

    public static String iter(String[] from){
        String res = new String();
        for(int i = 0; i < from.length; i++){
            if(from[i].equals("no")){
                from[i] = "no 1";
            }
            res += from[i] + " ";
        }
        return res;
    }

    public static String rec(String[] from){
        String word = from[0];
        if(word.equals("no")){
            word = "no 1 ";
        }
        if(from.length == 1)
            return word;
        String[] from_cpy = new String [from.length - 1];
        System.arraycopy(from, 1, from_cpy, 0, from_cpy.length);
        return word + rec(from_cpy);
    }
}