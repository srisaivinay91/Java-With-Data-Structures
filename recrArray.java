import java.util.ArrayList;

public class recrArray {
    public static void main(String[] args) {
    int[] array = {5,6,7,8,9,1,2,3};
    //System.out.println(sorted(array,0));
    //System.out.println(search(array,0,0));
    //Allindex(array, 0, 0);
    //System.out.println(list);
    //System.out.println(Allindex2(array, 0, 0, list));
    //System.out.println(Allindex3(array, 0, 0));
    System.out.println(rotated(array, 50, 0, array.length-1));
}
static boolean sorted(int[] array , int i){
    if(i == array.length-1){
        return true;
       }
    return array[i]<array[i+1] && sorted(array, i+1);
}
static boolean search(int[] array,int i,int target){
    if(i == array.length){
        return false;
    }
    /*in case of return index value integer
    first if case return -1;
    if(array[i]== target){
    return i;
    }
    return search(arrray,i+1,target);
     */
    return array[i]==target || search(array,i+1,target);
}
    // for returning index as arraylist
    static ArrayList<Integer> list = new ArrayList<>();
    static void Allindex(int[] array,int i,int target){
        if(i == array.length){
            return ;
        }
        if(array[i] == target){
            list.add(i);
        }
        Allindex(array, i+1, target);
    }

    static ArrayList<Integer> Allindex2(int[] array,int i,int target, ArrayList<Integer> list1){
        if(i == array.length){
            return list1;
        }
        if(array[i] == target){
            list1.add(i);
        }
        return Allindex2(array, i+1, target,list1);
    }
    // this is another way for returning arraylist without passing as
    // arguments and passing in the function
    static ArrayList<Integer> Allindex3(int[] array,int i,int target){
        ArrayList<Integer> list2 = new ArrayList<>();
        if(i == array.length){
            return list2;
        }
        if(array[i] == target){
            list2.add(i);
        }
        ArrayList<Integer> new1 = Allindex3(array, i+1, target);

        list2.addAll(new1);
        return list2;
    }


    static int rotated(int[] array , int target , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(array[mid]== target){
            return mid;
        }
        if(array[start] <= array[mid]){
            if(target >= array[start] && target <= array[mid]){
                return rotated(array, target, start, mid-1);
            }
            else{
                return rotated(array, target, mid+1, end);
            }
        }
        if(target >= array[mid] && target <= array[end]){
            return rotated(array, target, mid+1, end);
        }
        else{
            return rotated(array, target, start, mid-1);
        }
    }


}