import java.util.ArrayList;

public class recsubsequence {
    public static void main(String[] args) {
        subsqAscii("", "abc");
        //System.out.println(subsq2("", "abc"));
        }

    static void subsq(String p , String up){
        if(up.isEmpty()){
           System.out.println(p); 
           return ; 
        }
        
        char ch = up.charAt(0);

         subsq(p+ch,up.substring(1));
         subsq(p,up.substring(1));
    }
    // passing paramter eazzy
    static void subsq1(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }

        char ch = up.charAt(0);

        subsq1(p + ch, up.substring(1), list);

        subsq1(p, up.substring(1), list);
    }

    // without passing parameter
    static ArrayList<String> subsq2(String p , String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list; 
        }
        
        char ch = up.charAt(0);

         ArrayList<String> left = subsq2(p+ch,up.substring(1));
         ArrayList<String> right = subsq2(p,up.substring(1));

         left.addAll(right);
         return left;
    }
    static void subsqAscii(String p , String up){
        if(up.isEmpty()){
           System.out.println(p); 
           return ; 
        }
        
        char ch = up.charAt(0);

         subsqAscii(p+ch,up.substring(1));
         subsqAscii(p,up.substring(1));
         subsqAscii(p+(ch+0),up.substring(1));
    }
} 
