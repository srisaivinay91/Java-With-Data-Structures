public class oops1 {
    public static void main(String[] args) {
        //student student1; // Not Creating an object but declaring an object and runs in compile time
        // initializing
        Student2 student1 = new Student2();// new dynamically allocates memory and
        // returns a  reference to it and runs in runtime
        /*student1.marks = 89.7f;
        student1.rno = 7;
        student1.name = "Kunal";
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);*/
        
        Student2 kunal = new Student2(35,"Kunal",89.0f);

        System.out.println(kunal.rno);

        Student2 random = new Student2(kunal);
        System.out.println(random.name);

        Student2 default1 = new Student2();
        System.out.println(default1.name);

        Student2 one = new Student2();
        Student2 two = one;

        System.out.println(two.name);

        /*And when it comes to the final keyword it always initialized 
         * during the declaration part and also it makes the immutable 
         * behaviour for the primitive datatypes but not for the 
         * non-primitive but the values are changed in non-primitive
         * but not the entire reference variable to anotheer
         */
    }
    
}
class Student2 {
    int rno;
    String name;
    float marks;

    
    Student2 (int rno , String name , float marks) {
        this.rno= rno;
        this.name= name;
        this.marks= marks;
    }

    Student2 (Student2 other){
        this.name = other.name;

    }

    // Calling a Constructor inside another Constructor
    Student2(){
        this(67,"Vinay",99.9f);
    }
}
