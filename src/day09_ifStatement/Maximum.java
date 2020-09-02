package day09_ifStatement;

public class Maximum {
    public static void main(String[] args) {
        double a = 1000;
        double b = 2000;
        double c = 1500;

        boolean aIsMax = a > b && a > c ;
        boolean bIsMax = b > a && b > c ;
        boolean cIsMax = c > a && c > b ;

        double max = 0; // we want to assign the maximum number to variable max


        if (aIsMax){
           // System.out.println(a);
            max = a;
        }
        if (bIsMax){
            // System.out.println(b);
            max = b;
        }
        if (cIsMax){
            // System.out.println(c);
            max = c;
        }
        System.out.println(max+" is the Maximum number");


    }
}
