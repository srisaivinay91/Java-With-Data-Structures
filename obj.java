class calculator{
    // action done by the methods
    public int add(int n1 , int n2)
    {   int c = n1+n2;
        //System.out.println(c);
        return c;
    }
}
/* java devolepment kit --> JDK // JDK  contains the JRE
 * java virtual machine --> JVM // where we run the code , its a part of JRE
 * java runtime environment --> JRM // contains some pre defined files and classes
 */

public class obj {
    public static void main(String[] args)
     { 
       // object  - properties and behaviours
        int n1=9;
        int n2=98;
        // creating a object
        calculator cal = new calculator(); // cal is reference variable

        int result =cal.add(n1,n2);
        System.out.println(result);
    }
}
