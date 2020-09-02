package day23_Arrays;

public class Shopping {
    public static void main(String[] args) {
        String[] shoppinglist = new String[7];
        shoppinglist[0] = "Toilet Paper";
        shoppinglist[1] = "Hand Sanitizer";
        shoppinglist[4] = "eggs";
        shoppinglist[6] = "Corona Beer";
        shoppinglist[2] = "Bread";
        shoppinglist[3] = "Milk";
        shoppinglist[5] = "Water";

        for(int i = 0; i <= shoppinglist.length-1; i++){
            System.out.println(shoppinglist[i]);
        }



    }
}
