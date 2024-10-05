package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Place place;

    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminar(String title, Student[] students, Place place) {
        this.title = title;
        this.students = students;
        this.place = place;
    }

    public void print() {
        System.out.println(this.title);
        System.out.println(this.place.getAddress());
        if (students == null) return;
        for (Student student : students) {
            System.out.println(student.getName());
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
