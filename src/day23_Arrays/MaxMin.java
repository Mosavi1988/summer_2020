package day23_Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[]arr = {5,6,4,15,2,9, -100, 43000, -50000};
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i <= arr.length-1; i++ ){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);




    }
}
