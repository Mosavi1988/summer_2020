package Office_Hours.Practice_07_20_2020;

public class Max_3DArray {
    public static void main(String[] args) {
        int[][][] arr3D = {{{1,2},{3,4,5},{6,7,8,9}},{{11,22},{13,14,15},{16,17,18,19}} };
        //                               0                           1

        int max = arr3D[0][0][0];

        for(int[][] each2D : arr3D){
            for(int[] each1D : each2D){
                for(int eachNum : each1D){
                    if(eachNum > max){
                        max = eachNum;
                    }
                }
            }
        }
        System.out.println("Maximum: "+max);
    }
}
