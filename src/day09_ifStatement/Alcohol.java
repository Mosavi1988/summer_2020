package day09_ifStatement;

public class Alcohol {
    public static void main(String[] args) {
        boolean hasID =true;
        int age = 21;

        boolean eligible = hasID && age >= 21;
        //                  true && false

        String result = "";

        if (eligible == true){

            result = " You are eligible to buy alcohol";
        }
        if (eligible == false){
            result = " You are not eligible to buy alcohol";
        }
        System.out.println(result);


    }
}
