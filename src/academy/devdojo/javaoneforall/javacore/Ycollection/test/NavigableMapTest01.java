package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Customer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("William Suane");
        // The KEY must be a Comparable or you must pass a Comparator
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letter A");
        map.put("D", "Letter D");
        map.put("C", "Letter C");
        map.put("B", "Letter B");
        map.put("E", "Letter E");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Everything that comes before the argument passed.
        System.out.println(map.headMap("C", true));

        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.floorKey("C"));
        System.out.println(map.lowerKey("C"));
    }
}
