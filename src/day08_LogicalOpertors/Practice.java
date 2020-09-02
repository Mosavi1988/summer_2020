package day08_LogicalOpertors;

public class Practice {
    public static void main(String[] args) {
        String firsName = "Sayed Hassan";
        String lastName = "Mosavi";
        String fullName = firsName+" "+lastName;
        int age = 32;
        String Citizenship = "Afghan";
        boolean eligibleToVote = age >= 18 && Citizenship == "USA";
        System.out.println(fullName+" is eligible to vote: "+eligibleToVote);


    }




}
