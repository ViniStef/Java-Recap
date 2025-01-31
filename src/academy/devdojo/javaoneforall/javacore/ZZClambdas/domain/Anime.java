package academy.devdojo.javaoneforall.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private int episodes;

    public Anime(String title, int episode) {
        this.title = title;
        this.episodes = episode;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes +
                '}';
    }
}
