import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import Color.java;
import Nominal.java;
import Monopoly.java;

class l1{
    public static void main(String[] args){
        System.out.println("Look at this color: " + Color.BLUE);
        Monopoly game = new Monopoly();
        System.out.println("Lets start with all available Chances:");
        game.getAvailableChances();
        System.out.println("Lets get one random Chance Card:");
        game.getRandomChance();
        System.out.println("Lets walk through all available Properties:");
        game.getAvailableProperties();
        System.out.println("Now well see one random Property:");
        game.getRandomProperty();
        System.out.println("What about banknotes in the Bank?");
        game.getBank().showBank();
        
    }
}