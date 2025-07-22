public class Custom {

    private int[] data;
    private static int DEFAULT_SIZE  = 10;
    private size = 0;

    public Custom(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++] == num ;
    }

    private void resize(){
        int[] temp = new int[data.lenght * 2];

        // copy the elements

        for(int i = 0 ; i < data.lenght ; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull(){
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public static void main(String[] args) {
        Custom arr  = new Custom();
        arr.add(3);
        arr.add(5);

        System.out.println(arr);
    }
}
