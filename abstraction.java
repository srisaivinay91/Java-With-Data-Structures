// this is used to hide the useful info that is not used in further
// it means that Animal here the base class's all properties are used and
// consisted by the derived classes horse so, here we hide the class Animal
// by simply making it absract and it applies same for the its methods
abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("Animal eats");
    }
    Animal(){
        System.out.println("You are creating a New animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walks with 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks with 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        // when we are calling a derived call obj then automatically
        // the base class constructor is also called
        Horse horse = new Horse();
        horse.walk();
        horse.eats();

    }
}
