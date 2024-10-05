package academy.devdojo.javaoneforall.javacore.Einitializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    /* ORDER OF EXECUTION
     1 - Memory allocated for the object
     2 - Each class attribute is initialized
     3 - Init block is executed
     4 - Constructor is executed
    */

    // Instance initialization block
    {
        System.out.println("Inside init block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
