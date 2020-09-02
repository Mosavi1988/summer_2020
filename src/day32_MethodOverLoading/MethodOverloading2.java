package day32_MethodOverLoading;

public class MethodOverloading2 {
    public static void main(String[] args) {
        addition(20,12, 45, 55);
    }

    public static void addition(int a, int b){
        System.out.println(a+b);
    }
    public static void addition(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void addition(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }



}
