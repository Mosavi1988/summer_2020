package day29_CustomMethods;

public class Method_Practice {
    public static void main(String[] args) {
        oddNumbers();
        System.out.println("Hello");

        oddNumbers();
        System.out.println("Hello");

        evenNumbers();
    }

    // Task 1:
    public static void oddNumbers(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    // Task 2:
    public static void evenNumbers(){
        for(int i = 0; i <= 100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }




}
