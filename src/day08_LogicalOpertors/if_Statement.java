package day08_LogicalOpertors;

public class if_Statement {
    public static void main(String[] args) {
        int a = 2000;
        int b = 2000;

        if(a>b){
            System.out.println(a+" is the maximum number");

        }
        if (b>a){
            System.out.println(b+" is the max number");
        }
        if(a==b){
            System.out.println("Both are equal");
        }
        System.out.println("===================================================");
        boolean BreakTime = false;
        if(BreakTime==true){
            System.out.println("Take 15 minutes break!");
        }
        if(BreakTime==false){
            System.out.println("Keep Studying");
        }
        System.out.println("======================================================");

        boolean Corona = true;
        if(Corona==true){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more hand sanitizers");
            System.out.println("Social Distance");
            System.out.println("Stay at home");
        }









    }
}
