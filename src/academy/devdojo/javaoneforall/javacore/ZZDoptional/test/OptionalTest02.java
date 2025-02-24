package academy.devdojo.javaoneforall.javacore.ZZDoptional.test;

import academy.devdojo.javaoneforall.javacore.ZZDoptional.domain.Anime;
import academy.devdojo.javaoneforall.javacore.ZZDoptional.repository.AnimeRepository;

import java.util.List;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        List<Anime> animes = List.of(new Anime(1, "Black Clover", 120), new Anime(2, "One Piece", 900), new Anime(3, "Naruto", 500));

        AnimeRepository animeRepo = new AnimeRepository(animes);

        Optional<Anime> animeByTitle = animeRepo.findByTitle("One Piece");
        animeByTitle.ifPresent(a -> a.setTitle("One Piece 2"));
        System.out.println(animeByTitle);

        Anime animeById = animeRepo.findById(3).orElseThrow(IllegalArgumentException::new);
        System.out.println(animeById);

        Anime newAnime = animeRepo.findByTitle("Dragon Ball Z")
                .orElse(new Anime(4, "Dragon Ball Z", 300));
        System.out.println(newAnime);

    }
}
