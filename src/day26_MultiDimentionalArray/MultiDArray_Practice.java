package day26_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDArray_Practice {
    public static void main(String[] args) {
        String[] testers = {"Liliia", "Odina", "Cristina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sara"};
        String[] sm = {"Nurmamet"};
        String[] po = {"Nadir"};
        String[] ba = {"Alex"};

        String[] tester2 = { "Irene", "Aslan", "Nazar"};
        String[][] scrumTeam = { testers, developers, sm, po, ba};
        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("===================");

        scrumTeam[4][0] = "Adam";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0] = tester2;
        scrumTeam[3][0] = "Zeki";

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("============================");

        for(String[] each : scrumTeam){
            for(String name : each){
                System.out.println(name);
            }
            //System.out.println(Arrays.deepToString(each));
        }

        System.out.println("==========================================================================");

        int[][] scores = {{10,20,30,45},{60,55,75,105}, {93,48,125,135}};

        for(int[] eachArray : scores){
            for(int eachElemnt: eachArray)
            if(eachElemnt%3 == 0 && eachElemnt%5 ==0){
                System.out.print(eachElemnt + " ");
            }
        }





    }
}
