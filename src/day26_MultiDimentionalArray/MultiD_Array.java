package day26_MultiDimentionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'D'};
        char[] ch3 = {'F', 'G', 'H'};

        char [][] ch2D = {{'A', 'B'}, {'C', 'D', 'D'},{'F', 'G', 'H'}  };
        //                    0              1               2


        System.out.println(Arrays.toString(ch2D[1]));
        System.out.println(Arrays.toString(ch2D[2]));

        // H
        System.out.println(ch2D[2][2]);

        // C
        System.out.println(ch2D[1][0]);

        // G B
        System.out.println(ch2D[2][1]+" "+ch2D[0][1]);

        System.out.println("===================================================");
        // {1,2,3}, {4}, {5,6}, {7,8,9,10}

        int[][] num = {{1,2,3}, {4}, {5,6}, {7,8,9,10}};

        for(int[] each : num){
            System.out.println(Arrays.toString(each));
        }
        System.out.println("=====================================");
        for(int i = 0; i <= num.length-1; i++){
            System.out.println(Arrays.toString(num[i]));

        }
        System.out.println(Arrays.deepToString(num));


    }
}
