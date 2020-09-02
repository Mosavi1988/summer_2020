package day32_MethodOverLoading;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Number:");
        double firstNum = scan.nextDouble();
        System.out.println("Operator:");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number:");
        double secondNum = scan.nextDouble();

        double result = calculator(firstNum, operator, secondNum);
        System.out.println(result);
    }

    public static double calculator(double num1, char oper, double num2){
        double result = (oper == '+')? num1+num2 :(oper == '-')? num1-num2 :(oper == '*')? num1*num2 :
                (oper == '/')? num1/num2 :(oper == '%')? num1%num2 : 0;

        return result;
    }






}
