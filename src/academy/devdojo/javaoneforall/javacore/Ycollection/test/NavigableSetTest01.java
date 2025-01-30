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

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
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

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());
        mangas.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99, 5));
        mangas.add(new Manga(1L, "Berserk", 29.99,0));
        mangas.add(new Manga(2L, "Attack on Titan", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));
        mangas.add(new Manga(10L, "Slime", 1.99, 0));

        // mangas.descendingSet()
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyuHakusho = new Manga(11L, "Yuyu Hakusho", 1.99, 0);
        // lower -> first lower
        // floor -> first lower or equal
        // higher -> first higher
        // ceiling -> first higher or equal
        System.out.println("---------------");
        System.out.println(mangas.lower(yuyuHakusho));
        System.out.println(mangas.floor(yuyuHakusho));
        System.out.println(mangas.higher(yuyuHakusho));
        System.out.println(mangas.ceiling(yuyuHakusho));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // retrieve and remove the first one from the collection
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); // retrieve and remove the last one from the collection
        System.out.println(mangas.size());

    }
}
