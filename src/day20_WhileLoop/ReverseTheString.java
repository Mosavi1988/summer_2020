package day20_WhileLoop;

public class ReverseTheString {
    public static void main(String[] args) {
    String str = "Sayed Hassan Mosavi";
    //            01234567
    String result = "";

    int index = str.length()-1;
    while (index >= 0){

        result += str.charAt(index);

        index--;
    }
        System.out.println(result);


    }
}
