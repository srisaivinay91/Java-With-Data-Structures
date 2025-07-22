public class Cstack{
    protected int[] data;
    private static final int DEFAULT_SIZE;  
    
    int ptr = -1;

    public Cstack(){
        this(DEFAULT_SIZE);
    }

    public Cstack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            return false
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot pop from an empty stack");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;

        return data[ptr--];

    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("It is Empty")
        }
        return data[ptr];
    }


    private boolean isFull(){
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return ptr ==-1;
    }
}

public class DynamicStack extends Cstack{

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override

    public boolean push(int item){
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];
            
            for(int i =0 ; i < data.length ; i++){
                temp[i] = data[i];
            }
            data = temp;

        }

        return super.push(item);
    }
}

public class CustomStack {
    public static void main(String[] args) {
        
    }
}
