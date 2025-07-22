import java.util.*;

// Inheritance...

class Shape{
    String color;
    public void area(){
        System.out.println("Area ----> ");
    }

}

class Triangle extends Shape {
     
    public void area(float l , float h){
        double n = 0.5*l*h;
        System.out.println(n);
    }
} 

class EquiTraingle extends Triangle {


}
public class conceptsinoops{
    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.color = "Black";
        //T1.area();

        //T1.area(8,9);
        EquiTraingle e1 = new EquiTraingle();
        e1.color = "Blueee";
        //System.out.println(e1.color);
        
       
    }
}
