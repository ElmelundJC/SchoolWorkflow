import java.util.*;

public class Excercise12 {



// Den her opgave er ikke færdiggjort!!!!

    public boolean contains3(ArrayList<String> list) {
        boolean success = false;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String s : list) {

            // der sker en fejl i forbindelse med traversering af loop og indsættelse af key + value i hashmap.
            Integer count = hashMap.get(s);
            if (count == null || hashMap.containsKey(s) == true) {
                count = 0;
                hashMap.put(s, count + 1);
            }
        }

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
            if (entry.getValue() >= 3){
                System.out.println(entry.getKey() + ":" + entry.getValue());
                success = true;
            }

        }
        return success;
    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("A");
        str.add("A");

        Excercise12 e12 = new Excercise12();
        System.out.println(e12.contains3(str));

        System.out.println(str.toString());
    }


}

