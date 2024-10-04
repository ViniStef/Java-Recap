package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Vini");
        employee.setAge(24);
        employee.setSalary(new double[]{1000, 2000, 3000});

        employee.print();
        System.out.println(employee.getAverageSalary());
    }
}
