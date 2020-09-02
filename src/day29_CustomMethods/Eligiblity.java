package day29_CustomMethods;

public class Eligiblity {

    public static void main(String[] args) {
        vote("Hassan", 24, true, "Donal Trump");
        vote("Zia", 24, false, "Obama");

        calculator(25, '*', 5);
    }



    /*
    age, citizenship
     */
    public static void vote(String name, int age, boolean citizen, String presidentName){
        boolean eligibleToVote = age >= 18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote for "+presidentName);
        }else {
            System.out.println(name+" is not eligible to vote");
        }
    }

    public static void calculator(double num1, char operator, double num2 ){
        // +, -, *, /, %
        switch (operator){
            case '+':
                System.out.println("Addition "+ (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication "+(num1*num2));
                break;
            case '/':
                System.out.println("Division "+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder "+(num1%num2));
                break;
            default:
        }

    }
}
