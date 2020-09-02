package day28_Recap;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String word = scan.next();

        int count = 0; // "cat"
        for(int i = 0; i <= str.length()-word.length(); i++){
             if(str.substring(i, i+word.length()).equals(word)){
                 count++;
             }
        }
        System.out.println(count);






    }
}
