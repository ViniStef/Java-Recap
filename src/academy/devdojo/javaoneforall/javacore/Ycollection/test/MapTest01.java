package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("keuboard", "keyboard");
        map.put("mousw", "mouse");
        map.put("yoi", "you");
        // With sets, if you try to add an element that already exists, it just ignores it,
        // with maps it will replace the value.
        // HashMap<> uses the element's hash to order, if you need to keep the order of insertion use LinkedHashMap<>
        map.putIfAbsent("yoi2", "you22"); // doesn't replace if it already exists
        System.out.println(map);

        for (String key: map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("--------------");

        for (String value: map.values()) {
            System.out.println(value);
        }

        System.out.println("--------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
