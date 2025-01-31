package academy.devdojo.javaoneforall.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("HI", "OK", "HELLO");
        List<Integer> listOfNumbers = List.of(1, 2, 3, 4);

        // The line below is a shorter version of: forEach(listOfStrings, (String str) -> System.out.println(str));
        forEach(listOfStrings, str -> System.out.println(str));
        // The line below is a shorter version of: forEach(listOfStrings, (Integer num) -> System.out.println(str));
        forEach(listOfNumbers, num -> System.out.println(num));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
