package academy.devdojo.javaoneforall.javacore.ZZDoptional.repository;

import academy.devdojo.javaoneforall.javacore.ZZDoptional.domain.Anime;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class AnimeRepository {
    private final List<Anime> animes;

    public AnimeRepository(List<Anime> animes) {
        this.animes = animes;
    }

    public Optional<Anime> findById(int id) {
        return findBy(anime -> anime.getId() == id);
    }

    public Optional<Anime> findByTitle(String title) {
        return findBy(anime -> anime.getTitle().equals(title));
    }

    public Optional<Anime> findBy(Predicate<Anime> predicate) {
        Anime found = null;
        for (Anime anime : animes) {
            if (predicate.test(anime)) {
                found = anime;
            }
        }

        return Optional.ofNullable(found);
    }
}
