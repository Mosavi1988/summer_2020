package day15_String;

import java.sql.SQLOutput;

public class substring_method {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        //                   0123456789...

        //substring(beg index, end index)
        String word1 = sentence.substring(0 , 3+1);
        System.out.println(word1);

        String word2 = sentence.substring(8 , 11);
        System.out.println(word2);

        System.out.println("===============================================");
        String sentence2 = "I like Movies and TV Series";
        //                  0123456789......

        String word3 = sentence2.substring(7 , 13);
        System.out.println(word3);

        System.out.println("==================================================");
        String firstName = "mUhTaR";
        String firsCharacter = firstName.substring(0,1);
        String res = firstName.substring(1 , firstName.length());

        firstName = firsCharacter.toUpperCase()+res.toLowerCase();
        System.out.println(firsCharacter);
        System.out.println(res);
        System.out.println(firstName);

        System.out.println("========================================================");
        String lastName = "rAMaZaN";
        String firstChar = lastName.substring(0,1);//s
        String remaining = lastName.substring(1);//chool

        lastName = firstChar.toUpperCase()+remaining.toLowerCase();

        System.out.println(lastName);

        System.out.println("=====================================================");

        String s = "I like Game of Throne";
        String series = s.substring(7);

        System.out.println(series);


        String s2 = "I like Java Programming Language";
        String lanuage = s2.substring(7);
        System.out.println(lanuage);

    }
}
