package day10_IfStatement;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 80;
        String Grade = "";

        if(score >= 90 && score <= 100){
            Grade = " 'A' excellent";
        }else if(score >= 80 && score < 90){
            Grade = "'B' Good";
        }else if(score >=70 && score < 80){
            Grade = " 'C' Fair";
        }else if(score >= 60 && score < 70){
            Grade = "'D' Poor";
        }else if ( score >= 1 && score < 60){
            Grade = "'F' Fail";
        }else{
            Grade = "Error";
        }
        System.out.println(Grade);








    }
}
