package streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anna","xent","charlie","dia");
        list.stream() // intermediate - giver os mulighed for at fortsætte med med metode kald.
                .filter(s -> !s.startsWith("A"))
                .sorted()
                .forEach(System.out::println); //Terminal operation //:: betyder at det er en referance til metoden og ikke et kald
    }           // collect(Collectors.toList()); Terminal operation
}
