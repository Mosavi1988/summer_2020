package Office_Hours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"Java", "C#", "C#", "Python", "Python", "Java", "Ruby"};


        for(String b: words){
            int count = 0;

            for(String each : words){
                if(each.equals(b)){
                    count++;

                }
            }
            if(count == 1){
                System.out.println(b);
            }
        }



    }
}
