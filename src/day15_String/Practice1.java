package day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String fisrtName = input.nextLine();
        System.out.println("Enter you Last name:");
        String lastName = input.nextLine();

        char ch1 = fisrtName.charAt(0);
        char ch2 = lastName.charAt(0);
        System.out.println("your initial is: "+ch1+"."+ch2);


    }
}
