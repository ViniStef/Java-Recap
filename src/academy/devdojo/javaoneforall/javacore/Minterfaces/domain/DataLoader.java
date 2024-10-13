package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Checking permission general");
    }
}
