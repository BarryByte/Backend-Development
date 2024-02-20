package Basics;

public class Main {
    public static void main(String[] args) {
        Person p1 =  new Person();
        System.out.println(p1); // prints the address of the object p1
        System.out.println(p1.age); // 
        System.out.println(p1.height); // 
        System.out.println(p1.name); // 
        System.out.println(p1.weight); // 
    
        Person p2 = p1; // shallow copy

        p2.age++;

        System.out.println(p1.age);
    }    
}
