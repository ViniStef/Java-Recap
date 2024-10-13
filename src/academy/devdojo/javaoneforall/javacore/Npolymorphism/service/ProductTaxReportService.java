package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReportService {

    public static void generateTaxReport(Product product) {
        System.out.println("Starting the tax report");
        System.out.println("Product " + product.getName());
        System.out.println("Price " + product.getPrice());
        double taxValue = product.calculateProductTax();
        System.out.println("Tax value "+taxValue);
        if (product instanceof Tomato){
            System.out.println(((Tomato) product).getBestConsumedBefore());
        }
     }
}
