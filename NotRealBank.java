import java.util.Map;
import java.util.HashMap;
import Nominal.java;

public class NotRealBank{
    private Map<Nominal, Integer> banknotes;
    NotRealBank(){
        banknotes = new HashMap<Nominal, Integer>();
    }

    public void addBanknotes(Nominal n, int quantity){
        if(banknotes.containsKey(n)){
            banknotes.replace(n, banknotes.get(n) + quantity);
        }else{
            banknotes.put(n, quantity);
        }
    }

    public Integer getQuantity(Nominal n){
        if(banknotes.containsKey(n)){
            return banknotes.get(n);
        }else{
            return 0;
        }
    }

    public void showBank(){
        for(Map.Entry<Nominal, Integer> entry : banknotes.entrySet()){
            System.out.println("Nominal: " + entry.getKey().val + "\nBanknotes in this bank: " + entry.getValue());
        }
    }
}