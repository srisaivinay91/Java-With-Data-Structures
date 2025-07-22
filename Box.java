

public class Box1{
    
        double l;
        double h;
        double w;
    
        public Box1 () {
            this.l=-1;
            this.h=-1;
            this.w=-1;
        }
        //cube
        public Box1 (double side){
            this.l= side;
            this.h= side;
            this.w= side;
        }
        public Box1(double l,double h,double w){
            this.l=l;
            this.h=h;
            this.w=w;
        }
        public Box1(oops3 old){
            this.l=old.l;
            this.h=old.h;
            this.w=old.w;
        }
        
}

public class BoxWeigth extends Box1{

    double weight ;

    public BoxWeigth(){
        this.weight = -1;
    }
    // By using the super keyword in this constructor only refres to the
    // items contains in the Box class excluding the refernce vari
    // Boxweight exactly as the box bo3 = new boxweight(1,2,3,4);

    public BoxWeigth(BoxWeigth other){
        super();// calls the box not the BoxWeight;
    }
    public BoxWeight(doule l ,double h,double w, double weight){
        //super(l,h,w);// used to initialize the values present in the parent class
        this.weight = weight;
    }
}


public class Box {
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
