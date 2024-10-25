package academy.devdojo.javaoneforall.javacore.Xserialization.domain;

import java.io.*;

// Serializable in here is a Flag
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -8181454993354723334L;
    private Long id;
    private String name;
    private transient String password;
    private transient Seminar seminar;
    // No need to serialize static attributes given that they belong to the class itself
    private final static String SCHOOL_NAME = "DevDojo";

    public Student(long id, String name, String password) {
        System.out.println("Inside student constructor");
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(seminar.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String seminarName = ois.readUTF();
            this.seminar = new Seminar(seminarName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", seminar='" + seminar + '\'' +
                ", school_name='" + SCHOOL_NAME + '\'' +
                '}';
    }
}
