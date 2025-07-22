
public class oops3 {
    double l;
    double h;
    double w;

    oops3 () {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    //cube
    public oops3 (double side){
        this.l= side;
        this.h= side;
        this.w= side;
    }
    public oops3(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    public oops3(oops3 old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
    
    public void Info(){
        System.out.println("Running of the box");
    }
    
    public class another extends oops3{

    } 
    public static void main(String[] args) {
        System.out.println("Running the oops3 or Box ");
        oops3 oop= new oops3(4,9,89);
        //oops3 oop1= new oops3(oop);
        System.out.println(oop.l +" " +oop.h+" "+ oop.w +" ");
        //System.out.println(oop1.l +" " +oop1.h+" "+ oop1.w +" ");
        //another an =  new another();
        //System.out.println(an.l +" " +an.h+" "+ an.w +" ");

    }
}
