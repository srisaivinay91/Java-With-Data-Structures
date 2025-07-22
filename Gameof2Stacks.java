import java.util.*;

public class Twostacks{

    static int twoStacks(int x , int[] a , int[] b){
        return twostacks(x, a, b, 0, 0) -1 ;
    }
    private static int twostacks(int x ,int[] a , int[] b , int c , int sum){
        if(sum > x){
            return c;
        }

        if(a.length == 0 || b.length == 0){
            return c;
        }
        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 0, a.length), b , c+1 , sum+a[0]);
        int ans2 = twoStacks(x, a , Arrays.copyOfRange(b, 0, b.length), c+1 , sum+b[0]);

        return Math.max(ans1, ans2);
    }
}


public class Gameof2Stacks {
    public static void main(String[] args) {
        
    }
}
