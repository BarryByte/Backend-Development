package DesignScaler;

public class Instructor {
    String name;
    String email;
    String password;
    String levelOfInstructor;

    public Instructor(String name, String email, String password, String levelOfInstructor){
        this.name = name;
        this.email = email;
        this.password = password;
        this.levelOfInstructor = levelOfInstructor;
    }
    
    public String toString(){
        return this.name;
    }
}
