package day16_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you employeed?");
        String answer = input.next();

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Unemployeed");
        }


    }
}
