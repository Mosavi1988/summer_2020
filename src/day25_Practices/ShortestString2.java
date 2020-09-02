package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tony", "Adam", "Musa", "Alan"};
        int minLength = arr[0].length(); //4

        for(String each :arr){// to find out the minimum length of the String in the array
            int l = each.length(); // 4 8 4 8

            if(l < minLength){
                minLength = l;
            }
        }

        for(String each : arr){ // to see how many Strings' lengths in the array matching the shortest length.
            if(each.length() == minLength){
                System.out.print(each+" ");
            }
        }


    }
}
