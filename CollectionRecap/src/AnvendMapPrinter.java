import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnvendMapPrinter {
    public static void main(String[] args) {
        MapHelper<String,Double> mapHelper = new MapHelper();
        Map<String, Double> movieMap = new HashMap<>();
        movieMap.put("Matrix", 5.0);
        movieMap.put("Braveheart", 5.0);
        movieMap.put("Big Lebowsky", 2.0);
        movieMap.put("Verden Udenfor", 5.0);
        movieMap.put("Star Wars", 3.0);
        List<Map.Entry<String,Double>> sorteret = mapHelper.sortMapToList(movieMap);
        mapHelper.printList(sorteret);
        //mapHelper.printMap(movieMap);
    }
}
