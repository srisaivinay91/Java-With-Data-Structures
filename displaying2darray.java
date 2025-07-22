public class displaying2darray {
    public static void main(String[] args) {
        int nums[][] = new int[4][4];
        int m;
        for(int i=0; i<4 ; i++){
            for(int j=0; j<4;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }
        for(int n[] : nums){
            for(int k : n){
                System.out.print(k + " ");
            }
            System.out.println();
        }
        /*
         * jagged array means of specified number of rows and not clmns
         * int nums[][] = new int[8][];
         * nums[0] = new int[2]; --> this shows row no 0 having of 2 clms 
         * 
         * for(int i=0 ; i< nums.length ;i++){
         * for(int j=0 ; j< nums[i].length ;j++){
         * }}
         */
    }
}
