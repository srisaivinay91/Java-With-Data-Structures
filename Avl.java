public class Avl {
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

        return rotate(node);
    }


    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            // Left Heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                // Left Left Case
                return Rightrotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                // Left right Case
                node.left = Leftrotate(node.left);
                return Rightrotate(node);
                
            }
        }

        if(height(node.left) - height(node.right) < -1){
            // Right Heavy
            if(height(node.right.left) - height(node.right.left) < 0){
                // Right Right Case
                return Leftrotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                // Right Left Case
                node.right = Rightrotate(node.right);
                return Leftrotate(node);
                
            }
        }
        return node;
    }

    public Node Rightrotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.left = p;
        p.left = t;
        
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public Node Leftrotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.right = c;
        c.right = t;
        
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
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
