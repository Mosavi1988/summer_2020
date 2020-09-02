package day13_Scanner;

import java.util.Scanner;

public class nextline_VS_nextmethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = input.nextDouble();
        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("salary: "+salary);
        System.out.println("full name: "+fullName);



    }
}
