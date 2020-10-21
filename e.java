class e{
    public static void main(String [] args){
        double i = 0, a = 1;
        double S = a;
        double E = Math.pow(10, -10);
        double x = Double.parseDouble(args[0]);
        while(Math.abs(a) > E){
            i += 1;
            a = a * (x / i);
            S += a;
        }
        System.out.println("e^x, where x = " + x + " equals " + S);
    }
}