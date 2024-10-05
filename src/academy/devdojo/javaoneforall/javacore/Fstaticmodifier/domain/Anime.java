package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    /* ORDER OF EXECUTION
     0 - Static init block is executed when the JVM loads the class and only once
     1 - Memory allocated for the object
     2 - Each class attribute is initialized
     3 - Init block is executed
     4 - Constructor is executed
    */

    // Instance initialization block
    static {
        System.out.println("Inside init block 1");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside init block 2");
    }

    static {
        System.out.println("Inside init block 3");
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

    public static int[] getEpisodes() {
        return episodes;
    }
}
