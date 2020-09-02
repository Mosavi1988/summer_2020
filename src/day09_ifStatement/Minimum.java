package day09_ifStatement;

public class Minimum {
    public static void main(String[] args) {
        double a = 100;
        double b = 70;
        double c = 65;

        boolean aIsMin = a < b && a < c;

        boolean bIsMin = aIsMin == false && b < c;
                      // b < a && b < c
        boolean cIsMin = !aIsMin && !bIsMin ;

        double min = 0;

        if (aIsMin){
            min = a;
        }
        if (bIsMin){
            min = b;
        }
        if (cIsMin){
            min = c;
        }
        System.out.println(min+" is the minimum number");



    }
}
