package DesignScaler;

import java.util.ArrayList;

public class Batch {
    public String name;
    public String date;
    ArrayList<Student> listOfStudents;
    Instructor instructor;

    public Batch(String name, String date, Instructor instructor){
        this.name = name;
        this.date = date;
        this.instructor = instructor;
        listOfStudents = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        listOfStudents.add(student);
    }
}
