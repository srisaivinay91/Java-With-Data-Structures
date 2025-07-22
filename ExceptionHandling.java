public class ExceptionHandling {
    public static void main(String[] args) {
        int a =0;
        int b=7;

        
    // Tells to try thiz code
        try{
            //divide(a,b);
            
            //throw new Exception("Just kidding");
            String name = "Kunal";
            if(name.eqauls("kunal")){
                throw new Myexception("Bye");
            }
        }
    // Here where the exception tested and print according to the
    // try block code 
    
    // We can wright multiple catch blocks according to exceptions u may think
    // that going to occur 
    
    // And can only wirte the sub exceptions above the excetion catch block
    // Bcz the below ones are already called by the main exception class and
    // return as already found
        catch(MyException e){
            System.out.println("Own");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException ");
        }
        
        catch(Exception e){
            System.out.println("Someother Exception");
        }
        
    // Finally as name suggests it will executed without 
    // any requirements 
    
        finally{
            System.out.println("Enjoy Pandagoooo");
        }
        
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(a == 0){
            throw new ArithmeticException("Gandu dont divide by 0");
        }

        return b / a;
    }
    
    public class MyException extends Exception{
        
        MyException(String name){
            super(name);
        }
    }
}
