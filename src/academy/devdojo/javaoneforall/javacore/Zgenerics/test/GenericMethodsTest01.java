package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;

import java.util.Comparator;
import java.util.List;

public class GenericMethodsTest01 {
    public static void main(String[] args) {
        List<Boat> boatList = createArrayWithOneObject(new Boat("Big boat"));
    }

    private static <T> List<T> createArrayWithOneObject(T t) {
        return List.of(t);
    }

//    private static <T extends Comparator<T>> List<T> createArrayWithOneObject(T t) {
//        return List.of(t);
//    }
}
