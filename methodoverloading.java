class calculator{
    int num = 9; //we can use this in method
    // this is called instance variable and the each method has its
    // own stack memory of local variables , and instan var are in heap
    // but the obj ref are stored in stack but linked to the present in heap via address
    public int add(int n1, int n2){
        int result = n1 +n2;
        return result;
    }
    public int add(int n1, int n2, int n3){
        int result = n1 +n2 + n3;
        return result;
    }
    // same mathods of different parameters and of same parameters of 
    // different datatype passing
}


public class methodoverloading {
    public static void main(String[] args) {
        calculator cal = new calculator();
        //System.out.println(cal.add(39, 90));
        System.out.println(cal.add(39, 90,89));
        //System.out.println(cal.num); by using obj we can call inst var
        // we can also call it in two diff objs and by changing var value in 
        // one obj cannot reflect in another one
    }
}
