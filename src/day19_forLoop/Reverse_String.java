package day19_forLoop;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" please Enter your phrase to reverse it: ");
        String str = scan.nextLine();

       // String result = ""+str.charAt(4)+ str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        String result = "";

        for(int i = str.length()-1; i >= 0; i--){ // i: 4, 3, 2, 1, 0
            result += str.charAt(i);

        }

        System.out.println(result);

    }
}
