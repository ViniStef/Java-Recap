package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salary;

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
    }

    public void calculateAndPrintAverageSalary() {
        double averageSalary = 0;
        for (double salaryValue: salary) {
            averageSalary += salaryValue;
        }

        averageSalary /= salary.length;

        System.out.println("Average Salary is " + averageSalary);
    }
}
