package academy.devdojo.javaoneforall.javacore.Oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;
import academy.devdojo.javaoneforall.javacore.Oexception.exception.domain.Person;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingWithExceptionsTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.save();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // When overriding, it's not mandatory to throw the exact same exceptions or to throw any at all
        Employee employee = new Employee();
        try {
            employee.save();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
