package day20_WhileLoop;

import java.util.Scanner;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("Enter your Password: ");
        String input = scan.nextLine();

        while (!input.equals(password)){
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }
        System.out.println("Logged in");





    }
}
