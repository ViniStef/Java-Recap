package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Ford X";
        car1.model = "X Series Big";
        car1.year = 2021;

        car2.name = "BMW Z";
        car2.model = "Z Series New";
        car2.year = 2024;

        car2 = car1;

        System.out.println("Car 1");
        System.out.println("Name: " + car1.name + "| Model: " + car1.model + "| Year: " + car1.year);

        System.out.println("Car 2");
        System.out.println("Name: " + car2.name + "| Model: " + car2.model + "| Year: " + car2.year);

    }
}
