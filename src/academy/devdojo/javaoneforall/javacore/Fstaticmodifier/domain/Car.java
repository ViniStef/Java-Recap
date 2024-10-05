package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    public static double speedLimit = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("----------------");
        System.out.println("Car name " + this.name);
        System.out.println("Max speed " + this.maxSpeed);
        System.out.println("Speed limit " + Car.speedLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
