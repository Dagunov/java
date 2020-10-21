import Printable.java;

public abstract class Card implements Printable{
    protected String title;
    private String description;
    private String effect;

    Card(String t, String d, String e) {
        title = t;
        description = d;
        effect = e;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getEffect() {
        return effect;
    }

    public abstract void printInfo();

    public abstract void action();
}