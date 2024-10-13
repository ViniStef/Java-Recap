package academy.devdojo.javaoneforall.javacore.Npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.Npolymorphism.domain.Tomato;

public class ProductTaxReportService {

    public static void generateComputerReport(Computer computer) {
        System.out.println("Starting the report for Computer");
        System.out.println("Computer " + computer.getName());
        System.out.println("Price " + computer.getPrice());
        double taxValue = computer.calculateProductTax();
        System.out.println("Tax value "+taxValue);
    }

    public static void generateTomatoReport(Tomato tomato) {
        System.out.println("Starting the report for Tomato");
        System.out.println("Tomato " + tomato.getName());
        System.out.println("Price " + tomato.getPrice());
        double taxValue = tomato.calculateProductTax();
        System.out.println("Tax value "+taxValue);
    }
}
