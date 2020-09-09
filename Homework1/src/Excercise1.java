import java.util.ArrayList;

public class Excercise1 {

    int vowelCount = 0;

    public void totalVowels(ArrayList<String> list){
        if (list.size() == 0 ){
            System.out.println(0);
        }

        for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i);
                temp.toLowerCase();

                for (int j = 0; j < temp.length(); j++){
                    char ch = temp.charAt(j);

                    if(temp.charAt(j) == 'a' || temp.charAt(j) == 'e' || temp.charAt(j) == 'i' || temp.charAt(j) == 'o'|| temp.charAt(j) == 'u' || temp.charAt(j) == 'æ' || temp.charAt(j) == 'ø' || temp.charAt(j) == 'å'){
                        vowelCount++;
                    }
                }
        }
        System.out.println(vowelCount);
    }

    public static void main(String[] args) {
        Excercise1 excercise1 = new Excercise1();
        ArrayList<String> list = new ArrayList<String>();


        list.add("emma");
        list.add("lars");
        list.add("torsten");
        list.add("trine");
        list.add("bo");
        excercise1.totalVowels(list);
    }

}
