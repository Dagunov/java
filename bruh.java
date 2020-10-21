public class bruh {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        //PUT YOUR CODE HERE
        double x1;
        double x2;
        double d = b*b-4*a*c;
        if(d > 0.0){
            x1 = (-b - Math.sqrt(d))/(2*a);
            x2 = (-b + Math.sqrt(d))/(2*a);
        }else if(d < 0.0){
            x1 = 0;
            x2 = 0;
        }else{
            x1 = (-b)/(2*a);
            x2 = x1;
        }
        if(x1 == 0.0 && x2 == 0.0)
            System.out.println("x1=\nx2=");
        else
            System.out.println("x1=" + x1 + "\nx2=" + x2);
        //PUT YOUR CODE HERE
    }
}