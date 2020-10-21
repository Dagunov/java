public enum Nominal{
    ONE(1, Color.WHITE),
    TEN(10, Color.BLUE),
    TWENTY(20, Color.GREEN),
    FIFTY(50, Color.PURPLE),
    HUNDREED(100, Color.YELLOW),
    FIVEHUNDREED(500, Color.ORANGE);
    public int val;
    public Color color;
    Nominal(int value, Color c){
        val = value;
        color = c;
    }
}