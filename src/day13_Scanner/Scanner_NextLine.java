package day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your company name:");
        String companyName = input.nextLine();

        System.out.println("Enter your home address:");
        String homeAddress = input.nextLine();

        System.out.println("Your full name is: "+fullName);
        System.out.println("Your comapny name is: "+companyName);
        System.out.println("Your address is: "+homeAddress);

    }
}
