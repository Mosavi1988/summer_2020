package day21_Loops;

public class DevideTwoNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;

        if(b == 0){
            System.out.println("Invalid number");
            System.exit(0);
        }

        int count = 0;
        while (a >= b){
            a -= b;
            count++;
        }
        System.out.println(count+" with a remainder of "+a);
    }
}
