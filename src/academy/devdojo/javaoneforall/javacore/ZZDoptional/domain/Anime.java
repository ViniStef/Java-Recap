package academy.devdojo.javaoneforall.javacore.ZZDoptional.domain;

public class Anime {
    private int id;
    private String title;
    private int chapters;

    public Anime(int id, String title, int chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
