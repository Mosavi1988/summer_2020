package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        String[] names = {"Aalia","Nurbye", "Ayse", "Hassan"};

        for(int i = 0; i <= names.length-1; i++){
            if(!names[i].startsWith("A")){
                continue;

            }
            System.out.println(names[i]);
        }
        System.out.println("===============================================================");

        int[] numbers = new int[5];
        numbers[3] = 25;
        numbers[0] = 100;
        numbers[3] = 300;

        System.out.println(Arrays.toString(numbers));
        System.out.println("=================================================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        String[] students = new String[scan.nextInt()];

        for(int i = 0; i<= students.length-1; i++){
            System.out.println("Please Enter a name:");
            students[i] = scan.next();
        }


        System.out.println(Arrays.toString(students));



    }
}
