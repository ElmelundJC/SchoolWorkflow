package streams;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Predicate<String> isShort = s -> s.length() < 4;
        System.out.println(isShort.test("bo"));
    }
}
