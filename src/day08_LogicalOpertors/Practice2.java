package day08_LogicalOpertors;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = " Sayed Amir";
        String lastName = "Mosavi";
        String fullName = firstName+" "+lastName;
        int age = 18;
        String citizen1 = "USA";
        String citizen2 = "Afgh";

        boolean eligibleAge = age >= 18;
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        boolean eligibleToVote = eligibleAge && usCitizen;
        System.out.println(fullName+" is eligible to vote for Donald Trump: "+eligibleToVote);





    }




}
