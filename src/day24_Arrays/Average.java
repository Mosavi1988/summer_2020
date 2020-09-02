package day24_Arrays;

public class Average {
    public static void main(String[] args) {
        int[] arr = {10,20,15,10};

        int sum = 0;

        for (int i = 0; i <= arr.length-1; i++){
            sum += arr[i];
        }
        System.out.println("sum: "+sum);

        double average = sum/(double)arr.length;
        System.out.println("Average number is:"+average);




    }
}
