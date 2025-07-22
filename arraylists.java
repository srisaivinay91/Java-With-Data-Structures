import java.util.ArrayList;
import java.util.Scanner;
public class arraylists {

    // Multiple Threads Can acccess the object at a time 
    // So it is Unsynchronized

    // Vectors is also same as arraylist but it is synchronized meant that one therad 
    // Can access object at a tme
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        /*list.add(90);
        list.add(56);
        System.out.println(list);
        // capacity is not allowed till 10 and it can go further
        System.out.println(list.contains(90));
        list.set(0,89);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);*/
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i));// list[index] not works here
        }

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        //initialization
        for(int i =0;i<3;i++){
            list2.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                list2.get(i).add(sc.nextInt());
            }
        }
    }
}
