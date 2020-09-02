package day11_NestedIf_Switch;

public class DaysInMonths {
    public static void main(String[] args) {
        int month = 5;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean Invalid = month < 1 || month > 12;

        String result = "";

        if(days28){
            result = "28 days";
        }else if(days30){
            result = "30 days";
        }else if(Invalid){
            result = "Invalid";
        }else{
            result = "31 days";
        }
        System.out.println(result);

    int num = 50;
    num += 50;
        System.out.println(num);




    }
}
