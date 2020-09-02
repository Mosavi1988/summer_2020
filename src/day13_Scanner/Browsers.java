package day13_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "safari";

        // boolean, long, double, float are not accepted in switch statement
        switch (browserName){
            case "chrome":
                System.out.println("Opening chrome Browser");
                break;
            case "firefox":
                System.out.println("Opening Firefox Browser");
                break;
            case "opera":
                System.out.println("Opening Opera Browser");
                break;
            case "safari":
                System.out.println("Opening Opera Browser");
                break;
            case "edge":
                System.out.println("Opening Edge Browser");
                break;
            default:
                System.out.println("Invalid Browser Name");
        }





    }
}
