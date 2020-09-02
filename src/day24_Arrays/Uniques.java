package day24_Arrays;

import java.util.Scanner;

public class Uniques {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a phrase to get the unique characters:");
        String str = scan.nextLine();
        String expectedresult = "";

        for(int j = 0; j <= str.length()-1; j++){
            char ch1 = str.charAt(j);
            int count = 0;

            for(int i = 0; i <= str.length()-1; i++) { // used for finding the frequency of ch and assign to each.
                char each = str.charAt(i);
                if (ch1 == each) {
                    count += 1;
                }
            }

            if(count == 1){
                expectedresult += ch1;

            }

        }
        System.out.println(expectedresult);



    }
}
