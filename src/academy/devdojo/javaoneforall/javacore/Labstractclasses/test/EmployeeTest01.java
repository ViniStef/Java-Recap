package academy.devdojo.javaoneforall.javacore.Labstractclasses.test;

import academy.devdojo.javaoneforall.javacore.Labstractclasses.domain.Developer;
import academy.devdojo.javaoneforall.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Zoro", 12000);
        manager.print();
        System.out.println(manager);
        developer.print();
        System.out.println(developer);
    }


}
