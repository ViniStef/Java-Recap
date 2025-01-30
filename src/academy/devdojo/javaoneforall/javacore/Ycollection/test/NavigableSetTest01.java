package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;
import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getName().compareTo(smartphone2.getName());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        // It keeps the order of insertion
        // The Object passed needs to be implementing Comparable
        // The TreeSet uses the compareTo method, be careful!
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        set.add(new Smartphone("111", "LG"));
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Pokemon", 19.99));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99));
        mangas.add(new Manga(1L, "Berserk", 29.99));
        mangas.add(new Manga(2L, "Attack on Titan", 39.99));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99));
        mangas.add(new Manga(10L, "Slime", 1.99));
        mangas.add(new Manga(10L, "Slime", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
