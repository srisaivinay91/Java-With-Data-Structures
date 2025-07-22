//package maps;
import java.util.HashMap;
import java.util.Map;

public class Map {
    public static void main(String[] args) {
        Map<Integer,mString> map = new HashMap<Integer, String>();
        map.put(10,"King");
        map.put(20,"Queen");
        map.put(20,"Soilder");

        for(Map.Entry<Interger, String> m : map.entrySet())   {
            System.out.println(m.getkey()+ " : " + m.getValue() );
        }  
    }
}
