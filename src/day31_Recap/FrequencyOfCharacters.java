package day31_Recap;
import Library.Util;
public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AABBBCCC";

        String expectedResult = "";

        String nonDup = Util.removeDup(str);  // ABC




        for( char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each); // 2
            expectedResult += ""+each+count1;
        }


       /* for(int i = 0; i <= nonDup.length()-1; i++){
            char ch1 = nonDup.charAt(i); // A
            int count1 = Util.frequency(str,ch1); // 2
            expectedResult += ""+ch1+count1;
        }
        */


        /*
        char ch1 = nonDup.charAt(0); // A
        int count1 = Util.frequency(str,ch1); // 2
        expectedResult += ""+ch1+count1;

        char ch2 = nonDup.charAt(1); //B
        int count2 = Util.frequency(str, ch2);
        expectedResult += ""+ch2+count2;

        char ch3 = nonDup.charAt(2); //B
        int count3 = Util.frequency(str, ch2);
        expectedResult += ""+ch3+count3;
         */


        System.out.println(expectedResult);

        System.out.println("=================================================================");

        String str2 = "wwweeeeeerrrr";
        String expectedResult2 = FrequencyOfChars(str2);
        System.out.println(expectedResult2);
    }

    public static String FrequencyOfChars(String str){
        String expectedResult = "";

        String nonDup = Util.removeDup(str);  // ABC


        for( char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each); // 2
            expectedResult += ""+each+count1;
        }
        return expectedResult;
    }




}
