package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {
        // charAt();
        String str = "Cybertek";
        //            01234567
         char ch1 = str.charAt(4);
        System.out.println(ch1);

        // concat(); , +
        String str2 = "Cybertek";
        str2 = str2+" School";

        System.out.println(str2);

        // length(); ==>
        String str3 = "Cybertek School is fun and entertaining";
        //             01234567
        int l = str3.length();
        System.out.println(l);

        // last index: length-1

        char ch2 = str3.charAt(l-1);
        System.out.println(ch2);

        // UpperCase & lowerCase
        String str4 = "Cybertek";
        str4 = str4.toUpperCase();
        System.out.println(str4);

        String str5 = "JAVA";
        str5 = str5.toLowerCase();
        System.out.println(str5);

        // trim();
        String str6 = "   Cybertek School            ";
        str6 = str6.trim();
        System.out.println(str6);

        // substring(); Ending index is excluded and beginning index is included
        String str7 = "I like Java Language";
        //             0123456789.....
        String word = str7.substring(7,11);
        System.out.println(word);

        String word1 = str7.substring(12);
        String word2 = str7.substring(12,str7.length()-1+1);
        System.out.println(word1);
        System.out.println(word2);

        // indexOf() & lasIndexOf();
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);
        System.out.println(str8.charAt(i1));

        int i2 = str8.indexOf("We");
        System.out.println(i2);

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf("J");
        int i6 = str9.indexOf(" Java " )+1;
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);

        // replace & replaceFirst
        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#");
        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java ", "C# ");
        System.out.println(s2);






    }
}
