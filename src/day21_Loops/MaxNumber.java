package day21_Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648; // 30

        for(int i = 10; i <= 50; i += 10){
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > max){ // if the next user input is greater than previous number it will be placed with previous.
                max = num;
            }
        }
        System.out.println("Max number is:"+max);


    }
}
