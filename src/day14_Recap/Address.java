package day14_Recap;



import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
        int buildingnumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();

        System.out.println("Enter your zip coe:");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("\nShip to: "+fullName+"\n        "+buildingnumber+" "+streetAddress+"\n        "+cityName+", "+state+" "+zipCode);






    }
}
