package day30_CustomMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WarUp_Tasks {
    public static void main(String[] args) {

        maxNum(25,25);

        int arr[] = {5,2,3,4,5,6,4,7,0,-5,-56,-55,-5,54,-45,-45,-45};
        printDesc(arr);

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14};
        combine2Arrays(a1,a2);

        PosNegZero(75);
        System.out.println("====================================================");

    }

    // tasks01:
    public static void maxNum( int a, int b){
        if(a == b){
            System.out.println("Equal");
            return;
        }
        if(a>b){
            System.out.println(a+" is maximum");
        }else {
            System.out.println(b+" is maximum");
        }



    }

    // task02:
   public static void printDesc(int[] arr){ // {10,9,20,30,5,6,7
       Arrays.sort(arr);

       for(int i = arr.length-1; i >= 0; i--){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }

   // task03

    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for(int each : arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    // task 04:
    public static void PosNegZero(int num){
        if(num>0){
            System.out.println(num+" positive");
        }else if(num<0){
            System.out.println(num+" negative");
        }else {
            System.out.println(num+" zero");
        }
    }







}
