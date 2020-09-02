package day32_MethodOverLoading;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        String firstName = "hAsSaN";
        String lasName = "MosAvI";

        String fullName;
        fullName = Util.formatFullName(firstName,lasName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName);
        System.out.println(uniques);

        String reverseName = Util.reverse(fullName);
        System.out.println(reverseName);

        System.out.println("===================================================");

        int[] a = {200, 400, 500, 200, 1000, 50, 40, 30, 400, 60, 78};
        int n = 2500;

        a = Util.addElement(a,n);
        System.out.println(Arrays.toString(a));









    }
}
