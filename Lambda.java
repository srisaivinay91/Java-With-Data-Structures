// These are the single line representation by replacing an method like statements

public class Lambda {
    public static void main(String[] args) {
        int a =0;
        int b=7;

        int c = b/a;

        System.out.println(c);
    }
    static divide(int a, int b) throws ArithmeticException{
        if(a == 0){
            throw new ArithmeticException("Gandu dont divide by 0");
        }

        return b / a;
    }
}
