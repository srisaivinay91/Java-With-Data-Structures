public class CQueue{
    protected int[] data;
    protected int size;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;

    public CQueue(){
        this(DEFAULT_SIZE);
    }

    public CQueue(int size){
        this.data = new int[size];
    }

    private boolean isFull(){
        return size == data.length;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int reomve() throws Exception{
        if(isEmpty()){
            throw new Exception("It is Empty")
        }
        int removed = data[front];
        front++;
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("It is Empty")
        }

        return data[front];
    }

    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("It is Empty")
        }
        int i = front;
        do{
            System.out.print(data[i] + " '");
            i++;
            i = i % data.length;
        }while(i != end)

        System.out.println("End"); 
    }
}

public DynamicQueue extends CQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override

    public boolean insert(int item){
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            
            for(int i = 0 ; i < data.length ; i++){
                temp[0] = data[(front+1) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
            
        return super.insert(item);
    }
}
public class CircularQueue {
    public static void main(String[] args) {
        
    }
}
