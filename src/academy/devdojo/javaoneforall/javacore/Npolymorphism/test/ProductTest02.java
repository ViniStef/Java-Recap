package academy.devdojo.javaoneforall.javacore.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Computer("Ryzen 9", 1000);
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.calculateProductTax());

        System.out.println("------------------");

        Product product2 = new Tomato("Dutch", 6);
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateProductTax());
    }
}
