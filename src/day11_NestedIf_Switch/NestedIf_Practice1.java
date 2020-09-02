package day11_NestedIf_Switch;

public class NestedIf_Practice1 {
    public static void main(String[] args) {
        double salary = 15000;
        int jobHistory = 1;

        if(salary >= 30000){
            if(jobHistory >= 2){
                System.out.println("You are qualified");
            }else {  // jobHistory < 2
                System.out.println(" You must have been at least 2 years on this job");
            }
        }else{
            System.out.println(" You must earn at least $ 30k");
        }






    }
}
