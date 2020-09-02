package day10_IfStatement;

public class Character_Identify {
    public static void main(String[] args) {
        char character = '@';
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        //                           upper case letters               || lower Case letters

        // 48 <= character <= 57
        boolean isDigit = character >= 48 && character <= 57;

        boolean specialChar = !isAlphabetic && !isDigit;

        String alphabet = "";

        if (isAlphabetic) {

            // System.out.println(character + " is Alphabetic Character");
            alphabet = character+ " is Alphabetic character";
        }
        else {
            // System.out.println(character + " is not Alphabetic Character");
            alphabet = character+" is not Alphabetic character";
        }
        System.out.println(alphabet);

        String digit = "";
        if (isDigit){
            digit = character+" is a digit ";
        }
        else{
            digit = character+" is not a digit";
        }
        System.out.println(digit);

        String specialCharacter = "";
        if (specialChar == true){
            specialCharacter = character+" is a special character";
        }else{
            specialCharacter = character+" is not a special character";
        }
        System.out.println(specialCharacter);


    }
}
