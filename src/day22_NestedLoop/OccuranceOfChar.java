package day22_NestedLoop;

import java.util.Scanner;

public class OccuranceOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a String:");
        String str = scan.nextLine();
        System.out.println("Please Enter a character:");
        char ch = scan.next().charAt(0);

        int count = 0;
/*
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);

            if(each == ch){
                count +=1;
            }
        }
 */

        int index = 0;
        while (index <= str.length() - 1) {
            char each = str.charAt(index);

            if (each == ch) {
                count += 1;
            }
            index++;
        }
        System.out.println(count);

    }
}