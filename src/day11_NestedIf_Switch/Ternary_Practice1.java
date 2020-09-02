package day11_NestedIf_Switch;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        int age = 18;
        String citizen = "USA";
        String result = "";

        if(age >= 18 && citizen == "USA"){
            result = "Can vote";
        }else {
            result = " Can't vote";
        }
        System.out.println(result);

        String result1 = (age >= 18 && citizen == "USA") ? "Can vote" : "Cannot vote";
        System.out.println(result1);

        int num = 100;
        int num2 = 200;

        String r = (num == num2)? "Equal" : "Not equal";
        System.out.println(r);



    }
}
