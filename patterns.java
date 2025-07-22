public class patterns {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        pattern5(5);
    }
    static void pattern1(int n){
        for(int  i =0 ; i<= n; i++){
            for(int j=0;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println(" ");
        }
    }
    static void pattern2(int n){
        for(int  i =0 ; i<= n; i++){
            for(int j=0;j<=n;j++){
                System.out.print("# ");
            }
            System.out.println(" ");
        }
    }
    
    static void pattern3(int n){
        for(int  i =1 ; i<= n; i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("# ");
                
            }
            System.out.println(" ");
            
        }
    }
    static void pattern4(int n){
        for(int  i =1 ; i<= n; i++){
            int p = 1;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p=p+1;
            }
            System.out.println(" ");    
        }
    }
    static void pattern5(int n){
        for(int  i =1 ; i<= n; i++){
            int p = 1;
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            
            }
            System.out.println(" ");    
        }
    }
}
