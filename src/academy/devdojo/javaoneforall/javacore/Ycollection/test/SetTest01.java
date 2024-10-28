package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        // HashSets will use the equals() and the hashCode(), it does not support duplicated elements!
//        Set<Manga> mangas = new HashSet<>();
        Set<Manga> mangas = new LinkedHashSet<>(); // Linked is good to keep the order of insertion
        mangas.add(new Manga(5L, "Pokemon", 19.99));
        mangas.add(new Manga(3L, "Hellsing ultimate", 59.99));
        mangas.add(new Manga(1L, "Berserk", 29.99));
        mangas.add(new Manga(2L, "Attack on Titan", 39.99));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99));
    }
}
