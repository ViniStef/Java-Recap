package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Vini");
        names.add("Stef");
        names2.add("DevDojo");
        names2.add("Academy");

        names.addAll(0, names2);

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("-------------");

        int size = names.size();
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
            names.add("Steff");
        }

        System.out.println(names);
    }
}
