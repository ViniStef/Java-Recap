package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Kami";
        professor.gender = 'M';
        professor.age = 150;

        System.out.println("Name: " + professor.name + " Age: " + professor.age + " Gender: " + professor.gender);

    }
}
