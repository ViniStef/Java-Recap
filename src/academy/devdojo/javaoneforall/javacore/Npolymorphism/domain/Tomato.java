package academy.devdojo.javaoneforall.javacore.Npolymorphism.domain;

public class Tomato extends Product {
    public static final double TAX_PERCENTAGE = 0.06;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateProductTax() {
        System.out.println("Calculating tax value for Tomato");
        return this.price * TAX_PERCENTAGE;
    }
}
