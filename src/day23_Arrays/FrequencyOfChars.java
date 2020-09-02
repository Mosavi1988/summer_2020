package day23_Arrays;

import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a phrase to calculate the repetition:");
        String str = scan.nextLine();
        String nonDup = ""; // "AB"


       for(int i = 0; i<= str.length()-1; i++){ // removing duplicates from str
            String ch =""+ str.charAt(i); // A, B, A, B
            if(!nonDup.contains(ch)){
                nonDup+=ch;
            }
        }

        String result = ""; // "A2B2"
        // str = "ABAB"       nonDup = "AB"


        for(int j=0; j<=nonDup.length()-1; j++){
            char ch =nonDup.charAt(j);
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    count+=1;
        }

            }
            result += ""+ch+count;


        }

        System.out.println(result);






    }
}
