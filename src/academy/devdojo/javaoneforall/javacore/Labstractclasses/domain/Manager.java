package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

public class Manager extends Employee{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void calculateSalaryBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
