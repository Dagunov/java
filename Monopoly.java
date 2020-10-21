import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import Color.java;
import Nominal.java;
import NotRealBank.java;

public class Monopoly {
    private NotRealBank bank;
    private Random rnd;

    class ChanceCard extends Card {
        ChanceCard(String t, String d, String e) {
            super(t, d, e);
        }
        ChanceCard(){
            super("", "", "");
        }
        @Override
        public String getTitle() {
            return "\"" + title + "\"";
        }
        public void printInfo(){
            System.out.println("Your chance is here!\n" + getTitle() + "\n" + getDescription());
        }
        public void action(){
            System.out.println("Well, now you have to " + getEffect());
        }
    }
    class PropertyCard extends Card{
        private Integer price;
        private Integer gain;
        private StringBuilder owner;
        PropertyCard(String t, String d, String e, Integer price, Integer gain){
            super(t, d, e);
            this.price = price;
            this.gain = gain;
            owner = new StringBuilder();
        }
        PropertyCard(){
            super("", "", "");
        }
        public void printInfo(){
            System.out.println("This is the property:\n" + getTitle() + "\n" + getDescription());
        }
        public void action(){
            System.out.println("You can buy " + getTitle() + " for a fair price of " + price + ", gain here equals " + gain + " when " + getEffect());
        }
    }

    private ArrayList<ChanceCard> chances;
    private ArrayList<PropertyCard> properties;

    private void bankToDefault(){
        bank = new NotRealBank();
        bank.addBanknotes(Nominal.ONE, 100);
        bank.addBanknotes(Nominal.TEN, 100);
        bank.addBanknotes(Nominal.TWENTY, 100);
        bank.addBanknotes(Nominal.FIFTY, 50);
        bank.addBanknotes(Nominal.HUNDREED, 50);
        bank.addBanknotes(Nominal.FIVEHUNDREED, 20);
    }

    Monopoly(){
        bankToDefault();
        rnd = new Random();

        chances = new ArrayList<ChanceCard>();
        chances.add(new ChanceCard("A", "Taxes!", "pay 150."));
        chances.add(new ChanceCard("B", "Rent!", "pay 200."));
        chances.add(new ChanceCard("C", "Competition!", "gain 10."));
        chances.add(new ChanceCard("D", "Fine!", "pay 20."));
        chances.add(new ChanceCard("E", "Salary!", "gain 500."));

        properties = new ArrayList<PropertyCard>();
        properties.add(new PropertyCard("pA", "A street.", "somebody walks", 200, 3));
        properties.add(new PropertyCard("pB", "A house.", "somebody stays", 500, 50));
        properties.add(new PropertyCard("pC", "A library.", "somebody reads", 300, 10));
        properties.add(new PropertyCard("pD", "A shop.", "somebody buys", 1000, 100));
        properties.add(new PropertyCard("pE", "A hotel.", "somebody sleeps", 2000, 250));
    }

    public void getRandomChance(){
        int ind = rnd.nextInt(chances.size());
        chances.get(ind).printInfo();
        chances.get(ind).action();
    }

    public void getRandomProperty(){
        int ind = rnd.nextInt(properties.size());
        properties.get(ind).printInfo();
        properties.get(ind).action();
    }

    public void getAvailableChances(){
        Iterator<ChanceCard> iter = chances.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getTitle());
        }
    }

    public void getAvailableProperties(){
        Iterator<PropertyCard> iter = properties.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getTitle());
        }
    }

    public NotRealBank getBank(){
        return bank;
    }
}