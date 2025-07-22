// It is the example where there is only a fun that doesnt perform implementation
// but it acts as reference for the child classes where the child classes contain the 
// body and act accordingly

// these are called abstract methods and the class contain onr or more abstract methods
// should call with the keyword Abstract

// we cant create a abstract constructors and cant create an object
// And these contain static methods and can be called by using parent

public abstract Parent{
    abstract void career();
    abstract void partner();

    static void hello(){
        System.out.println("Hello")
    }
}

class Son extends Parent {
    void career(){
        System.out.println("I am going to be a Man");
    }

    void partner(){
        System.out.println("I love Her");
    }
}

class Daughter extends Parent {
    void career(){
        System.out.println("I am going to be a Doctor");
    }

    void partner(){
        System.out.println("I love Ironman");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Son son = new Son();
        son.career();
        
        Daughter daughter = new Daughter();
        daughter.career();
        Parent.hello;
    }
}
