public class LinkedList {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.InsertFirst(32);
        ll.InsertFirst(90);
        ll.InsertFirst(3);
        ll.InsertLast(89);
        ll.Insert(2,2);
        ll.display();
        System.out.println(ll.DeleteFirst());
        //ll.DeleteLast();
        
        ll.InsertLast(77);
        ll.Delete(4);
        ll.display();
        //System.out.print(ll.size);
        
    }
}


class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
     public Node getNode(int index){
         Node node = head;

         for(int i =0 ; i< index ; i++){
             node = node.next ;
         }
            return node;
    }
    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size = size + 1;
    }
    
    
    public void Insert(int val , int index){
        if(index == 0){
            InsertFirst(val);
            return;
        }
        if(index == size){
            InsertLast(val);
            return;
        }

        Node temp = head;
        for(int i =1 ; i< index ; i++){
            temp = temp.next;
        }

        Node newnode = new Node(val,temp.next);
        temp.next = newnode;

        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    
    public void InsertLast(int val){
        if(tail == null){
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    
    public int DeleteFirst(){
        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
            
        }
         size--;
         return val;
    }
    
    public void DeleteLast(){

        if(size <= 1){
            DeleteFirst();
        }
        Node temp = head;
        while(temp.next.next != null){
            temp= temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
        return ;
    }
    
    public void Delete(int index){
    if(index == 0){
        DeleteFirst();
    }
    if(index == size){
        DeleteLast();
    }

    Node prev = getNode(index -1);
    
    prev.next = prev.next.next ;
    return;
    }
    
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

