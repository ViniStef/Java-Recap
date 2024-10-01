package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Student;
import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Midoriya";
        student01.age = 19;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 15;
        student02.gender = 'F';

        printer.print(student01);
        printer.print(student02);
        System.out.println("#################");
        printer.print(student01);
        printer.print(student02);
        // IMPORTANT
        // Every time we are passing an argument that is of a primitive type, we are sending a copy of the bits of the
        // value the variable holds

        // When we are sending a reference(Object)(reference variable), we are sending the reference that the reference
        // variable is having to the object

    }
}
