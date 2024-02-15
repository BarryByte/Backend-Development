package DesignScaler;

public class Scaler {
    public static void main(String[] args) {
        Instructor kshitij = new Instructor("Kshitij", "kshitij@scaler.com", "sdjfh123", "senior");
        TA purna = new TA("Purna", "purna@scaler.com", "jhsdf876", null);

        Student abhay = new Student("Abhay", "abhay@ms.sst.com", "uyer762");
        Student indrajeet = new Student("Indrajeet", "indrajeet@ms.sst.com", "sjhdf876");

        Batch batch1 = new Batch("Intake 1", "12-02-2024", kshitij);
        batch1.addStudent(abhay);
        batch1.addStudent(indrajeet);

        System.out.println("Batch Name: " + batch1.name);
        System.err.println("Instructor: " + batch1.instructor);
        System.out.println("Student List: " + batch1.listOfStudents);
    }
}
