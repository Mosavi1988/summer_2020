package day19_forLoop;

public class FINRA {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FINDRA"+" ");
            }else if( i % 3 == 0){
                System.out.print("FIN"+" ");
            }else if( i % 5 == 0){

            }else {
                System.out.print(i+" ");
            }
        }



    }
}