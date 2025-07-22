class Pen{
    String color;
    //String brand;
    String type;

    public void write() {
        System.out.println("Writing something");
    }
    public void printcolor() {
        System.out.println(this.color);
    }
    public void typing(){
        System.out.println(this.type);
    }
}

class Student1 {
    String name;
    int age;
    /* Starting of polymorphism
     Called a type named function Overloading
    where we use only the name same for methods in different of parameters
    Using same parameters can also possible by using different return type
    
    --->  and a Compile Time polymorphism */
    
    public void printInfo(String name) {
        System.out.println(this.name);
        //System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // End
    Student1() {
      // System.out.println("Constructed called");
    }

    Student1(String name , int age){
        this.name = name;
        this.age = age;
    }
    // Copy Constructor
    Student1(Student1 s1){
        this.name = s1.name;
        this.age = s1.age;
    }
}


public class apnaoops1 {
    public static void main(String[] args) {
        /*Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();
        pen1.printcolor();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ball point";

        //pen1.write();
        pen2.printcolor();
        pen2.typing();*/

        Student1 s1 = new Student1();
        s1.name = "rajesh";
        s1.age = 78;
        s1.printInfo(s1.name,s1.age);
    }
}
