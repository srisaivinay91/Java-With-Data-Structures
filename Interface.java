// when we specify obj diff to reference class then the obj is specify which version
// to be accessed but the reference is used for what to access


// Static interface methods should always have a body..
public interface Engine {
    static final int PRICE = 78000;
    void start();
    void stop();
    void acc();
}

public interface Brake {
    void brake();
}

public interface media{
    void start();
    void stop();
}

public class Car implements Engine , Brake{
    
    public void brake(){
        System.out.println("Brake like a Normal Car");
    }

    public void start(){
        System.out.println("I start like a Normal Car");
    }

    public void stop(){
        System.out.println("I stop like a Normal Car");
    }

    public void acc(){
        System.out.println("I Accelerate like a Normal Car");
    }

}
public class Interface {
    
    public static void main(String[] args) {
        
        Car car = new Car();
        car.acc();
        car.start();
        car.stop();
    }
}
