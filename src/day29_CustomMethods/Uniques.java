package day29_CustomMethods;

public class Uniques {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "D", "D", "E", "F"};

        for( String a : arr){
            int count = 0;

            for(String each : arr){
                if(a.equalsIgnoreCase(each) ){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(a+" ");
            }
        }







    }
}
