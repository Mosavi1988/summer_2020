package day07_Unary_ShortHand;
/*create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
  */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2051;
        boolean result = year % 4 == 0;
        System.out.println("Year "+ year + " is a leap year = " + result);
    }
}
