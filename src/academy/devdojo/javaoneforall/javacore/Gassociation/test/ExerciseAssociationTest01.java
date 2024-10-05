package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Place;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Professor;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Seminar;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Student;

public class ExerciseAssociationTest01 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 15);
        Student student2 = new Student("Mary", 16);
        Student student3 = new Student("Billy", 18);
        Student[] students = new Student[]{student1, student2,student3};
        Place place = new Place("5th Avenue");
        Seminar seminar1 = new Seminar("Improving Soft Skills", students, place);
        student1.setSeminar(seminar1);
        student2.setSeminar(seminar1);
        student3.setSeminar(seminar1);
        Seminar seminar2 = new Seminar("Improving Lifestyle", place);
        Seminar[] seminars = new Seminar[]{seminar1, seminar2};

        Professor professor = new Professor("Jenny", "Utility Knowledge", seminars);

//        System.out.println("----- Students -----");
//        student1.print();
//        student2.print();
//        student3.print();
//        System.out.println("----- Place -----");
//        place.print();
//        System.out.println("----- Seminars -----");
//        for (Seminar seminar : seminars) {
//            seminar.print();
//        }
//        System.out.println("----- Professor -----");
        professor.print();


    }
}
