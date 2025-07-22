import java.util.*;
public class Generics {
    // This is of Creating Own ArrayList
    public static void main(String[] args) {
        ArrayList array = new ArrayList<>(2);
        array.add(1);
        array.add(3);
        array.size();
        array.add(7);
        array.size();
    }
}

// Generics are used to make the entire list to be store single type of 
// the data..  known as type safety.. and at compile time
// Shown as ArrayList<Interger> array = new ArrayList<>(2);

// By using the extends keyword beside the object ex: T specified makes the object
// to get all the values allowed as Number class consists of float and int 
// by extending number makes allow of types that contain in it

// Here the T should be the class itself or the subclasses (By calling in main )