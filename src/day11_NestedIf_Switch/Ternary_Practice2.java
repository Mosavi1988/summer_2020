package day11_NestedIf_Switch;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        int num = -10;
        String result= "";
        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);
        String result1 = (num > 0)? "Positive" :(num < 0)? "Negative" : " zero";
        System.out.println(result1);

        System.out.println("===============================================================");
        int a = 90;
        int b = 90;
        String result2 =(a>b)? "a is greater":(b>a)? "b is greater":  "a and b are equal";
        System.out.println(result2);




    }
}
