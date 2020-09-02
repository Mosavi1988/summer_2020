package day19_forLoop;

import com.sun.security.jgss.GSSUtil;

public class Odd_Even {
    public static void main(String[] args) {
        // 1,3,5,7,9,11,12,......99
        for(int i = 1; i<100; i+=2){
            if(i% 5== 0 && i % 3 == 0){
                System.out.print(i+" ");
            }

        }
        System.out.println();

        for(int i=0; i <= 100; i++){
            if(i % 2 !=0){
                if(i % 5 == 0 && i % 3 == 0){
                    System.out.print( i + " ");
                }

            }

        }
        System.out.println("=========================================================================================");

        // Task02:
        //0 2 4 6 8 10 12 ..........100

        for(int i = 0; i <=100; i+=2){
            if(i % 3==0 && i % 5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i = 0; i <=100; i++){
            if(i % 2 ==0){// pre: Must be even number
                if(i % 5 ==0 && i % 3 ==0){//sub: the number MUST be devisible by 3&5
                    System.out.print(i+" ");
                }
            }
        }
    }
}
