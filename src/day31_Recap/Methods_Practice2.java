package day31_Recap;

public class Methods_Practice2 {
    public static void main(String[] args) {
        String name = "Hassan";
        reverse1(name);
        String rev = reverse2(name);
        System.out.println(name.equalsIgnoreCase(rev));

    }

    public static void reverse1(String str){
        String expectedResult = "";
        for(int i = str.length()-1; i >= 0; i--){
            expectedResult += str.charAt(i);
        }
        System.out.println(expectedResult);
    }

    public static String reverse2(String str){
        String expectedResult = "";
        for(int i = str.length()-1; i >= 0; i--){
            expectedResult += str.charAt(i);
        }
        return expectedResult;
    }





}
