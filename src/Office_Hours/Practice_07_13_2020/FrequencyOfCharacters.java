package Office_Hours.Practice_07_13_2020;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "OOPQQ"; // "02p1Q2"
        String nonDup = ""; // "OPQ"

        for(int i = 0; i <= str.length()-1; i++) {
            String s = "" + str.charAt(i); //O,O,P,Q,Q
            if (!nonDup.contains(s)) {
                nonDup += s;
            }

        }
        String result = "";

        // nonDup = "OPQ"        str = "OOPQQ"      ==========> O2P1Q2

        for(int j = 0; j <= nonDup.length()-1; j++){
            char ch1 = nonDup.charAt(j); // O
            int count = 0;
            for(int i = 0; i <=str.length()-1; i++){
                char each = str.charAt(i); // O O P Q Q
                if(each == ch1){
                    count += 1;
                }

            }
            result +=""+ ch1+count;
        }
        System.out.println(result);
     /*   char ch1 = nonDup.charAt(0); // O
            int count = 0;
            for(int i = 0; i <=str.length()-1; i++){
                char each = str.charAt(i); // O O P Q Q
                if(each == ch1){
                    count += 1;
                }

            }
            result +=""+ ch1+count;

            char ch2 = nonDup.charAt(1);
            int count2 = 0;
            for(int i = 0; i <= str.length()-1; i++){
                char each = str.charAt(i);
                count2 += 1;
            }
            result += ""+ch2+count2;

            char ch3 = nonDup.charAt(2); // Q
            int count3 = 0;
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);
            count3 += 1;
        }
        result += ""+ch3+count3;

      */

        }
    }

