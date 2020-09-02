package day12_Switch_Scanner;

import java.util.Scanner;

public class hourly_RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your Salary:");
        double salary = input.nextDouble();
        System.out.println("how many hour do you work in a week?");
        int weeklyHour = input.nextInt();

        int totalHours = weeklyHour * 52;
        double hourlyRate = salary / totalHours;
        System.out.println("Your hourly rate is: $"+hourlyRate);




    }
}
