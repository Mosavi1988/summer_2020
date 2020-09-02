package Office_Hours.Practice_07_20_2020;

public class Max_2DArray3 {
    public static void main(String[] args) {

        //                 0 1 2    0 1 2 3    0 1  2  3  4
        int [][] arr2D = {{1,2,3,532}, {4,5,6,7}, {8,9,10,11,12,20,367} };
        //                   0         1             2

        int max = arr2D[0][0];

        for(int i = 0; i <=arr2D.length-1; i++){

            for(int eachElement : arr2D[i]){
                if(eachElement > max){
                    max = eachElement;
                }
            }
        }
        System.out.println("Maximum: "+max);



    }
}
