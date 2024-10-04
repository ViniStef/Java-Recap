package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double averageSalary;

    public Employee(String name, int age, double[] salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {

    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (int i = 0;i < salary.length; i++) {
            System.out.println("Salary " + (i+1) + " " + salary[i]);
        }

        calculateAndPrintAverageSalary();
    }

    public void calculateAndPrintAverageSalary() {
        if (this.salary == null) return;

        for (double salaryValue: salary) {
            averageSalary += salaryValue;
        }

        averageSalary /= salary.length;

        System.out.println("Average Salary is " + averageSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

}
