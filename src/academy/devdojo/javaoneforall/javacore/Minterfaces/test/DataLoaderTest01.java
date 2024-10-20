package academy.devdojo.javaoneforall.javacore.Minterfaces.test;

import academy.devdojo.javaoneforall.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.javaoneforall.javacore.Minterfaces.domain.DatabaseLoader;
import academy.devdojo.javaoneforall.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
