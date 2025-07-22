public class queue {
    int size;
    int arr[];
    int front;
    int rear;

    queue(){
        this.size =5;
        this.arr= new int[size];
        this.front=-1;
        this.rear=-1;
        System.out.println("initialized");
    }
    public void enqueue(int data){
        if(rear==size-1){
            System.out.println("Is Full");
            return;
        }
        if(front == -1){
            front =0;
            rear=0;
            arr[rear]= data;
            return;
        }
        else{
            rear++;
            arr[rear]=data;
            return;
        }
    }
    public void display(){
        for(int i=front; i <= rear ; i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }
    public void dequeue(){
        if(front== -1 || front>rear) {
            System.out.println("Is Empty");
            return;
        }
        else{
            front++;
            return;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(9);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();
    }

}

