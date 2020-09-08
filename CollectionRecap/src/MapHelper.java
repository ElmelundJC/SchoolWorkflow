import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapHelper<K,V> {
    public static void main(String[] args) {
        new MapHelper();
    }

    void printMap(Map<K,V> map){
        for (Map.Entry<K,V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    void printList(List<Map.Entry<String,Double>> list){
        for (int i =0; i<list.size(); i++) {
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }
    }

    List<Map.Entry<String,Double>> sortMapToList(Map<String,Double> map){
        List<Map.Entry<String,Double>> list = map
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toCollection(ArrayList::new));
        return  list;
    }

}