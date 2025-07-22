class student{
    int rollno;
    String name;
}

public class arrays32 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.rollno = 9;
        s1.name = "vinay";

        student s2 = new student();
        s2.rollno = 7;
        s2.name = "pilla";
        
        student students[] = new student[2];
        students[0]=s1;
        students[1]=s2;

        //for(int i=0 ; i<students.length;i++){
          //  System.out.println(students[i].name +" : "+ students[i].rollno);
        //}

        // enhanced for loop or for each loop
        for(student stu : students){
            System.out.println(stu.name + " : "+ stu.rollno);
        }

        // string sort of things

        String name = new String("vinay");
        System.out.println("Hello "+ name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(3));
        System.out.println(name.concat(" varma"));
    }
}
