package day31_Recap;

public class Methods_Pracitce {
    public static void main(String[] args) {
        max(45, 56);
        int res = max2(2, 5);
        System.out.println(res);

    }

    public static void max(int a, int b){
        int max = a > b ? a : b;
        System.out.println(max);
        }

        public static int max2(int a, int b){
        int max2 = a > b ? a : b;
        return max2;
        }

    }
