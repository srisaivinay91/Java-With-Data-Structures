public class Binarysearchtree {
    public static void main(String[] args) {
        BST bst = new BST();
        int[] nums = {1, 4, 6, 8, 9, 24};
        bst.populate(nums);
        bst.display();
    }
}


public class BST {

    private class Node {
        private int val;
        private Node right;
        private Node left;
        private int height;

        public Node(int val) {
            this.val = val;
        }

        public int getValue() {
            return this.val;
        }
    }

    private Node root;

    public BST() {
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (val < node.val) {
            node.left = insert(val, node.left);
        }

        if (val > node.val) {
            node.right = insert(val, node.right);
        }

        node.height = Math.max(height(node.right), height(node.left)) + 1;

        return node;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    public void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + ": ");
        display(node.right, "Right child of " + node.val + ": ");
    }

    public boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.right) - height(node.left)) <= 1
                && balanced(node.left) && balanced(node.right);
    }

    public void balancing(int[] nums){
     
      balancing(nums , 0 , nums.length );
    }

    private void balancing(int[] nums ,int  start , int end){
      if(start >= end){
        return;
      }

      int mid = (start + end) / 2;

      this.insert(nums[mid]);
      balancing(nums, start, mid);
      balancing(nums, mid+1, end);

    }
    //preorderTraversal(TreeNode root)
    public void preorder(){
      preorder(root);
    }

    private void preorder(Node node){
      if(node == null){
        return;
      }

      System.out.println(node.val + " ");
      preorder(node.left);
      preorder(node.right);
    }

    public void inorder(){
      inorder(root);
    }

    private void inorder(Node node){
      if(node == null){
        return;
      }

      inorder(node.left);
      System.out.println(node.val + " ");
      inorder(node.right);
    }

    public void postorder(){
      postorder(root);
    }

    private void postorder(Node node){
      if(node == null){
        return;
      }

      postorder(node.right);
      postorder(node.right);
      System.out.println(node.val + " ");
      }
   
}
