package day06_comparisonOperator;

public class salaryCalculator {
    public static void main(String[] args) {
        double rate = 55;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.22;
        int weeklyHours = 48;

        double salary = rate * weeklyHours*48;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double salaryAfterTax = salary - totalTax;
        System.out.println("salary before tax: " + salary +" USD");
        System.out.println("Total Tax:" + totalTax +" USD");
        System.out.println("Take home salary:"+ salaryAfterTax+" USD");
        System.out.println(salary);



    }




}
