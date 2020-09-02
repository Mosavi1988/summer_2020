package day08_LogicalOpertors;

public class Odd_Even {
    public static void main(String[] args) {
        int num = 38;
        boolean even = num % 2 == 0;
        boolean odd = !even;

        if(even){
            System.out.println(num+" is even number");
        }
        if(odd){
            System.out.println(num+" is odd number");
        }

    }



}
