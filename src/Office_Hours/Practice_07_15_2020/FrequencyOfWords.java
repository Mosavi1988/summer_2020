package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str = "dog dog dog catcatcatcatcatcat";

        int countOfDog = 0;

        while(str.contains("dog")){
            countOfDog++;
            str = str.replaceFirst("dog","");
        }

        int counOfCat = 0;

        while (str.contains("cat")){
            counOfCat++;
           str = str.replaceFirst("cat","");


        }
        System.out.println("Cat: "+counOfCat);
        System.out.println("Dog: "+countOfDog);




    }
}
