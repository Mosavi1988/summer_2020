package day13_Scanner;

import java.util.Scanner;

public class nextline_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter your full street name:");
        String streetName = input.nextLine();

        System.out.println("Your full address is: "+buildingNumber+" "+streetName);
        input.close();
        




    }
}
