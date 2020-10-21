public enum Color{
    WHITE,
    BLUE,
    GREEN,
    PURPLE,
    YELLOW,
    ORANGE;
    @Override
    public String toString(){
        switch(this){
            case WHITE: return "White";
            case BLUE: return "Blue";
            case GREEN: return "Green";
            case PURPLE: return "Purple";
            case YELLOW: return "Yellow";
            case ORANGE: return "Orange";
            default: return "Other color";
        }
    }
}