package academy.devdojo.javaoneforall.javacore.Minterfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission() {
        System.out.println("Checking permission general");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Inside retrieveMaxDataSize in the interface DataLoader");
    }
}
