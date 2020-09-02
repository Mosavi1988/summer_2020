package Office_Hours.Practice_07_20_2020;

public class Max_2DArray {
    public static void main(String[] args) {

        //                 0 1 2    0 1 2 3    0 1  2  3  4
        int [][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12,20} };
        //                   0         1             2

        int max = arr2D[0][0];

        for(int j = 0; j <= arr2D.length-1; j++){

            int[] eachArray = arr2D[j];
            for(int i = 0; i <= eachArray.length-1; i++){
                int eachNum = eachArray[i];
                if(eachNum > max){
                    max = eachNum;
                }
            }
        }
        System.out.println("Maximum: "+max);

/*
        int[] eachArray1 = arr2D[1];
        for(int i = 0; i <= eachArray.length-1; i++){
            int eachNumer1 = eachArray[i];
            if(eachNumer1 > max){
                max = eachNumer1;
            }
        }
        int[] eachArray2 = arr2D[2];
        for(int i = 0; i <= eachArray.length-1; i++){
            int eachNumer2 = eachArray[i];
            if(eachNumer2 > max){
                max = eachNumer2;
            }
        }

 */




    }
}
