package day06_comparisonOperator;

public class implicit_explicit {
    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1;

        long l2 = s1;

        int I1 = 300;
        double D1 = I1;
        System.out.println(D1);

        double D2 = I1;

        System.out.println("=================================================");
        double d1 = 400.55555;
        int i1 = (int)d1;
        System.out.println(i1);

        long L1 = 4400;
        short sh1 = (short)L1;
        System.out.println(sh1);

        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1);

        double m1 = 34.5;
        float f1 = (int)m1;
        System.out.println(f1);

        long r1 = -500;
        int p1 = (int)r1;
        System.out.println(p1);



    }
}
