package day05_ArithmeticOperators;

public class EmployeeInfo2{
    public static void main(String[] args) {
            String firstName = "Aaron";
            String lastName = "Jones";
            int age = 128;
            String CompanyName = "CapitaOne";
            char gender = 'M';
            String jobTitle = "SDET";
            boolean isFullTime = true;
            boolean isMarried = false;
            double salary = 120_000.50;
            String fullName = firstName+" " + lastName;

            System.out.println("Emplooye' full name is:"+fullName);
            System.out.println(fullName+ "' gender is;" + gender );
            System.out.println(fullName +"' age is:" + age + "years old");
            System.out.println(fullName + "works at:" +CompanyName);
            System.out.println(fullName +"' job title: "+ jobTitle);
            System.out.println(fullName+"' salary is: $"+salary);
            System.out.println(fullName + "is full time:"+ isFullTime);
            System.out.println(fullName + "is married:"+ isMarried);



        }



}
