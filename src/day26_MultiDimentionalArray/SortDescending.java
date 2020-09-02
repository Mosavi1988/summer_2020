package day26_MultiDimentionalArray;
import java.util.Arrays;
public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {10,11,8,9,12,5,15};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length];
        /*desc[0] = arr[2];
        desc[1] = arr[1];
        desc[2] = arr[0];

         */

        int k = arr.length-1;
        for(int i = 0; i <= desc.length-1; i++){
            desc[i] = arr[k];
            k--;
        }


        System.out.println(Arrays.toString(desc));


    }
}
