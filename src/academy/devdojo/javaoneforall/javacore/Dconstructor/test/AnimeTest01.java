package academy.devdojo.javaoneforall.javacore.Dconstructor.test;

import academy.devdojo.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Finished", "Television IG");
        Anime anime2 = new Anime();
//        anime.init("Akudama Drive", "TV", 12, "Finished");
        anime.print();
        anime2.print();
    }
}
