package day09_ifStatement;

public class Vote {
    public static void main(String[] args) {
        int age = 17;
        boolean usCitizen = true;

        if (age >= 18 && usCitizen){
            System.out.println("Eligible to vote for Trump");

        }
        else{
            System.out.println(" Not Eligible to vote to Trump");
        }



    }

}
