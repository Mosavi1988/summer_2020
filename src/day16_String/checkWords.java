package day16_String;

public class checkWords {
    public static void main(String[] args) {

        String str = "book";
        // last index = length-1
        // second index = length -2
        // third index = length -3

        if (str.length() == 0) {
            System.out.println("empty string");
        } else if (str.length() >= 3) {
            System.out.println(str.substring(str.length() - 3));
        } else {
            System.out.println(str);
        }

        String result = (str.length() == 0) ? "empty string" : (str.length() >= 3) ? str.substring(str.length() - 3) : str;
        System.out.println(result);

        System.out.println("=======================================================================================");

        String str1 = "ab";
        String str2 = "abc";
        String str3 = "ab";

        if (str1.length() == str2.length() && str1.length() == str3.length()) {
            System.out.println("All words are same length");
        } else if (str1.length() != str2.length() && str2.length() != str3.length() && str1.length() != str3.length()){
            System.out.println("All different length");
        }else {
            System.out.println("Not same nor Different length");
        }





    }
}
