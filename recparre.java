import java.util.Arrays;

public class recparre {
    public static void main(String[] args) {
        //patt1(4, 0);
        int arr[] = {4,3,2,1};
        //bubble(arr, arr.length-1, 0);
        sel(arr, arr.length,0, 0);
        System.out.println(Arrays.toString(arr));
        
    }

static void patt1(int row , int col){
    if(row == 0){
        return ;
    }
    if(row < col){
        System.out.print("# ");
        patt1(row, col+1);
    }
    else{
        System.out.println();
        patt1(row -1, 0);
        }
    }

static void bubble(int[] arr,int r,int c){
    if(r == 0){
        return ;
    }
    if(c < r){

        if(arr[c] > arr[c+1]){
            int temp = arr[c];
            arr[c] = arr[c+1];
            arr[c+1] = temp;
        }
        bubble(arr, r, c+1);
    }
    else{
        bubble(arr, r-1, 0);
      }
    }
 
static void sel(int[] arr , int r ,int c , int max ){
    //base condition
    if(r ==0){
        return ;
    }
    if(c < r){
        if(arr[c]> arr[max]){
        
        sel(arr, r ,c+1, c);
    }
    else{

        sel(arr, r, c+1, max);
    }
  }
  else{
    int temp = arr[max];
    arr[max]  = arr[r-1];
    arr[r-1] = temp;
    sel(arr, r-1, 0, 0);
  }
}
}