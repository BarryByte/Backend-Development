package introToLoop;

public class Client {
    
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Mohit";
        s.email = "mohit.sharma@scaler.com";
        s.batch = "SST";
        s.rollNo = 112;
        s.password = "password";
        s.psp = 54.0;

        System.out.println(s.name);
        Student s1 = s;


    }
}
