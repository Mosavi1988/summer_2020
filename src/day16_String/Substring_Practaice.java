package day16_String;

import java.util.Scanner;

public class Substring_Practaice {
    public static void main(String[] args) {
        // extra task
        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);

        String action = str.substring(10,15);
        System.out.println(action);





        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your fisrt word:");
        String str1 = scan.next();//apple

        System.out.println("Enter your second word:");
        String str2 = scan.next();//banana

        // ppleanana
        //String result = str1.substring(1).concat(str2.substring(1));
        String result = str1.substring(1)+str2.substring(1);
        System.out.println(result);




    }
}