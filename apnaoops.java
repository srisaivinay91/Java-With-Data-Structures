class Student23 {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class apnaoops {
    public static void main(String[] args) {
        Student23 s1 = new Student23();
        s1.name = "vinay";
        s1.age = 21;

        s1.printInfo();
    }
}
