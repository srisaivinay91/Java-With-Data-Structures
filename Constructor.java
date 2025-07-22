import java.util.*;

class Student {  
    String name;
    int age;
    private String password;

    //Accessing private data by using getters and setters
    public void setpassword(String vinay){
        this.password = vinay;
    }
    public String getpassword(){
        return password;
    }

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // constructor didnt have any return type and of three types as
    // non parameters , parameters , and copy constructors

    //Student(){
    //System.out.println("Constructor called");
    //}

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    // function overloading or method overloading is a compile time polymorphism
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name , int age){
        System.out.println(name + " " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("aman",8);
        //s1.name = "ganga";
        //s1.age = 24;

        s1.printinfo();
        s1.printinfo(57);
        s1.printinfo("vinay",20);
        s1.printinfo("Ganga");
        s1.setpassword("aleluah");
        System.out.println(s1.getpassword());
    }
}

