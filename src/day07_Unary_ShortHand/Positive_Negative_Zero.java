package day07_Unary_ShortHand;

public class Positive_Negative_Zero {
    public static void main(String[] args) {
        double num = 0.1;

        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean zero = num == 0;

        System.out.println(num +" is positive? "+ positive);
        System.out.println(num +" is negative? "+ negative);
        System.out.println(num +" is zero? " + zero);

        int a = 20;
        System.out.println(--a);

        // ++
        int b = 10;
        // b = b + 1;
        ++b;
        System.out.println(b);

        // pre:
        int x = 100;
        System.out.println(++x);

        int y = 200;
        System.out.println(--y);

        int z = 80;
        System.out.println(++z);
        System.out.println(--z);

        




    }
}
