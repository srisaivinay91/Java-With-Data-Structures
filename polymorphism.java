// polymorphism is generally of two types-->
//  1) Compile time or static polymorphism --> Achived by method overloading
//     Having of same name of methods but return type, arguments and parameters 
//     are different  
//     ex --> Multiple constrcutors


// 2) Run time polymorphism or dynamic polymorphism --> Achived by method overriding
//    Both the class of parent and child having of same methods with same name but 
//    the body is different
//    parent obj = new child();
//    The method calling by the above line is depend on the obj class type as
//    on the right one but not the parent type or super class refering 

//The overriding can be prevent by using final keyword before methods
//and this is call early binding

 //ex ---> final void shapes(){

//}

// Encapsulation means wrapping up the implementation of the members 
// and methods in a class and this deals with implementation issue 
// and works on internal level issue


//  Abstraction means hiding of the unnecessary details and showing valuable info
// it deals with the design level issue 
// Achieved by the interfaces and abstract classes and works on external level issue


public class num {

    void hell(){
        System.out.println("Ex for Method Overridong");
    }

    int sum(int a , int b){
        return a + b;
    }

    void sum(String b , int a){
        System.out.println("Hushuuu");
    }
}

class num2 extends num {
    void hell(){
        System.out.println("Ex for Method Overridong");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        num n = new num();  // create an object

        System.out.println(n.sum(2, 4));  // valid call to int sum(int, int)
        n.sum("hello", 0);                // valid call to void sum(String, int)
    }
}
