package day15_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();// Cybertek

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();//School

        String fullName = firstName.concat(" ".concat(lastName));//"CybertekSchool
        System.out.println("your full name is: ".concat(fullName));

    }
}
