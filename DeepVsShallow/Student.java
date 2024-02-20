package DeepVsShallow;

public class Student {
    int age; // 0
    String name; // null
    double psp; // 0.00
    int gradYear; // 0
    Exam exam; // null

    Student(){
        this.age = 18;
        this.name = "Abhay";
        this.psp = 0.0;
        exam = new Exam();  
    } 
    Student(Student other){
        this.age = other.age;
        this.name = new String(other.name); // this will call copy constructor of String
        this.psp = other.psp;
        this.exam = new Exam(other.exam); // this will call copy constructor of Exam
        this.exam.exam_id = other.exam.exam_id;
    }
}
