package Office_Hours.Practice_07_20_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Max_2DArray2 {
    public static void main(String[] args) {

        //                 0 1 2    0 1 2 3    0 1  2  3  4
        int [][] arr2D = {{1,2,3,532}, {4,5,6,7}, {8,9,10,11,12,20,367} };
        //                   0         1             2

        int max = arr2D[0][0];

        for(int[] each1D : arr2D){
            for(int eachElement : each1D){
                if(eachElement > max){
                    max = eachElement;
                }
            }
            }
        System.out.println("Maximum: "+max);



        }
    }

