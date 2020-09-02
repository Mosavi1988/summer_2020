package Office_Hours.Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {
        String str = "AFBABCD";
        String expectedresult = ""; // "C"

        // str = "ABABC";

        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j); // "A"
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                char each = str.charAt(i);
                if(each == ch){
                    count+=1;
                }
            }
            if(count == 1){
                expectedresult += ch;
            }
        }
        System.out.println(expectedresult);





    }
}
