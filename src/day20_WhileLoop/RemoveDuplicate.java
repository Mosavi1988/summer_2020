package day20_WhileLoop;
/*
3. write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aaabbb"; //"ab"
        //            0123

        String result = "";

       /* for(int i = 0; i <= str.length()-1; i++){
            String s = ""+str.charAt(i); // a, a, b, b
            if(result.contains(s)){ // if the character is already contained in result, we will not add it.
                continue;
            }
            result += s;
        }
        */

        for(int i = 0; i <= str.length()-1; i++){
            String s = ""+str.charAt(i); // a, a, b, b
            if(!result.contains(s)){ // if the character is already contained in result, we will not add it.
                result += s;
            }

        }
        System.out.println(result);







    }
}
