package academy.devdojo.javaoneforall.javacore.Zgenerics.test;

import academy.devdojo.javaoneforall.javacore.Zgenerics.Service.BoatRentalService;
import academy.devdojo.javaoneforall.javacore.Zgenerics.Service.RentalService;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Boat;
import academy.devdojo.javaoneforall.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest03 {
    public static void main(String[] args) {
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("Audi")));
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("Boat 1"), new Boat("Boat 2")));
        RentalService<Car> carRentalService = new RentalService<>(carsAvailable);
        Car car = carRentalService.retrieveAvailableObject();
        System.out.println("Using car for a month");
        carRentalService.returnRentObject(car);

        System.out.println("----------------");

        RentalService<Boat> boatRentalService = new RentalService<>(boatsAvailable);
        Boat boat = boatRentalService.retrieveAvailableObject();
        System.out.println("Using boat for a month");
        boatRentalService.returnRentObject(boat);
    }
}
