package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Vini";
        employee.age = 24;
        employee.salary = new double[]{1000, 2000, 3000};

        employee.print();
        employee.calculateAndPrintAverageSalary();
    }
}
