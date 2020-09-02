package day12_Switch_Scanner;

public class Age_Groups {
    public static void main(String[] args) {
        int age = 76;
        String ageGroup = "";

        if(age>0 && age<150 ){
         /*   if(age<21){
                ageGroup = "teenager";
            }else if(age<=55 ){
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }

          */

            ageGroup = (age<21)? "Teenager":(age<=55)? "Adult" : "Senior";
        }else{
            ageGroup = "invalid age";
        }
        System.out.println(ageGroup);




    }
}
