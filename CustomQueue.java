public class CQueue{

    protected int[] data;
    protected int size;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CQueue(){
        this(DEFAULT_SIZE);
    }

    public CQueue(int size){
        this.data = new int[size];
    }

    private boolean isFull(){
        return end == data.length;
    }

    private boolean isEmpty(){
        return ptr == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int reomve() throws Exception{
        if(isEmpty()){
            throw new Exception("It is Empty")
        }
        int removed = data[0];
        // Shift the elements to left
        for(int i =1 ; i < end ; i++){
            data[i-1] = data[i];

        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("It is Empty")
        }

        return data[0];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("It is Empty")
        }

        for(int i = 0 ; i < end ; i++){
            System.out.print(data[0] + " ");
        }
        System.out.println("END");
    }
}


public class CustomQueue {
    public static void main(String[] args) {
        
    }
}
