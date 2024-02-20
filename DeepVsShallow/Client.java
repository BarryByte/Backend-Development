package DeepVsShallow;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(st1);
        System.out.println("Hey!");
        st1.exam.exam_id =30;
        System.out.println("yohohohoo");
        System.out.println(st1.name);
        System.out.println(st2.name);
    }
}
