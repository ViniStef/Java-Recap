package academy.devdojo.javaoneforall.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("John", "Mark", "Suzy");
        List<String> developers = List.of("Vini", "Will", "Makw");
        List<String> students = List.of("Mary", "Siwe", "Core");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }

        // All 3 have the same output!
        System.out.println("---------------");

        devdojo.forEach(list -> list.forEach(System.out::println));

        System.out.println("---------------");

        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }

}
