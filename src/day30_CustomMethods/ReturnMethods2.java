package day30_CustomMethods;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name = "level";
       // revStr1(name);
        //System.out.println(name.equalsIgnoreCase(revStr1(name)));
        System.out.println(name.equalsIgnoreCase(revStr2(name)));
    }

    public static void revStr1(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    public static String revStr2(String str2){
        String result = "";
        for(int i = str2.length()-1; i >= 0; i--){
            result += str2.charAt(i);
        }
        return result;
    }




}
