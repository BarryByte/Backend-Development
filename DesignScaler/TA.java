package DesignScaler;

public class TA {
    public String name;
    public String email;
    private String password;
    public String currentCompany;

    public TA(String name, String email, String password, String currentCompany){
        this.email = email;
        this.name = name;
        this.password = password;
        this.currentCompany = currentCompany;
    }
    public void update_password(String new_password){
        this.password = new_password;
    }

    public void createMentorSession(String students){
        System.out.println("Mentor session has been for " + students);
    }


}
