package day16_String;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstword = scan.next();

        System.out.println("Enter your second word:");
        String secondword = scan.next();

        String result = (firstword.equalsIgnoreCase(secondword))? "Equal": "Not equal";
        System.out.println(result);


    }
}
