import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class Collections {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(90);

        System.out.println(list);

        List<Integer> list2 = new Vector<>(); 
        list2.add(56);
        list2.add(90);    
        
        System.out.println(list2);
    }
}
