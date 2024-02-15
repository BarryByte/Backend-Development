package DesignScaler;

public class Student {
    public String name;
    public String email;
    private String password;
    protected double psp;
    public Mentor mentorAssigned;
    public TA taAssigned;
    public Batch batch;

    public Student(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    private void updatePassword(String newPassword){
        this.password = newPassword;
    }

    protected void updatePsp(double newPsp){
        this.psp = newPsp;
    }

    public void assignMentor(Mentor mentor){
        this.mentorAssigned = mentor;
    }

    public void assignTa(TA ta){
        this.taAssigned = ta;
    }

    public void assighBatch(Batch batch){
        this.batch = batch;
    }

    public String toString(){
        return this.name;
    }
}
