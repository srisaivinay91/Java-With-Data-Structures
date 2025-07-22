import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        //perm("", "abc");
        //ArrayList<String> a = perm12("", "abc");
        //System.out.println(a);
        //System.out.println(permcount("", "abcp"));
        System.out.println(permcount("", "abc",0));
    }

    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i =0 ; i<= p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            perm(first + ch + second, up.substring(1));

        }
    }

    static ArrayList<String> perm12(String p, String up){
        if(up.isEmpty()){
            //System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i =0 ; i<= p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            ans.addAll(perm12(first+ch+second,up.substring(1)));

        }
        return ans;
    }

    static int permcount(String p, String up){
        if(up.isEmpty()){
            
            return 1;
        }
       
        char ch = up.charAt(0);

        int count = 0;
        for(int i =0 ; i<= p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            count = count + permcount(first + ch + second, up.substring(1));

        }
        return count;
    }

    static int permcount(String p, String up, int count){
        if(up.isEmpty()){
            
            return 1;
        }
       
        char ch = up.charAt(0);

        for(int i =0 ; i<= p.length();i++){
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            count = count + permcount(first + ch + second, up.substring(1));

        }
        return count;
    }
}
