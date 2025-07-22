public class recursiuonn {
    public static void main(String[] args) {
        //rec1(5);
        //System.out.println(fact(5));
        //System.out.println(digitsum(1342));
        //System.out.println(pod(951));
        //System.out.println(rev(785314));
        //System.out.println(rev1(413587));
        //System.out.println(zeros(40002540));
        System.out.println(zeros(3064001));
    }
    static void rec1(int n){
        if(n==0){
            return;
        }
        //System.out.println(n); #case of both
        rec1(n-1);
        System.out.println(n);
        }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }
    static int digitsum(int n){
        if(n ==0){
            return 0;
        }
        return (n%10)+ digitsum(n/10);
    }
    static int pod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)* pod(n/10);
    }
    static int rev(int n){
        if(n%10==n){
            return n;
        }
        int rem =0;
        rem = n%10;
        System.out.print(rem);
        return rev(n/10);
    }
    static int rev1(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem* (int)(Math.pow(10, digits-1)) + helper(n/10,digits-1);
    }
    //static int count =0;
    static int zeros(int n){
        return helper1(n,0);
    }
    //static int rem;
    private static int helper1(int n , int count){
        if(n==0){
            return count;
        }
        int rem = n %10;
        if(rem == 0){
            return helper1(n/10, count+1);
        }
        else{
            return helper1(n/10, count);
        }
        //return count;
    }
}
