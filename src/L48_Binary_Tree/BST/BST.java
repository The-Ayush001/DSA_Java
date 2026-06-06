package L48_Binary_Tree.BST;

public class BST {
    static class Node{
        int value;
        Node left;
        private Node right;
        int height;

        Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node){
        return node == null ? -1 : node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    // INSERT METHOD:
    public void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }
    public void populateSorted(int[] arr){
        populateSorted(arr, 0, arr.length);
    }
    private void populateSorted(int[] arr, int start, int end){
        // Base condition
        if(start >= end){
            return;
        }
        int mid = (start + end) / 2;
        insert(arr[mid]);

        populateSorted(arr, start, mid);
        populateSorted(arr, mid+1, end);
    }

    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node == null){  // if node is null then create the new node and return it.
            node = new Node(value);
            return node;
        }

        // if the value is less then root --> insert into left of the root node.
        if(value < node.value){
            node.left = insert(value, node.left);
        }

        // if the value is greater then root -->  insert into right of the root node.
        if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right))+1; // increasing the height
        return node;
    }

    // BALANCED
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    // DISPLAY METHOD:
    public void display(){
        display(root, "Root Node: ");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + ": ");
        display(node.right, "Right child of " + node.value + ": ");
    }

    // PreOrder traversal: (Root, Left, Right)
    public void PreOrder(){
        PreOrder(root);
    }
    private void PreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    //InOrder Traversal: (Left, Root, Right)
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        System.out.println(node.value + " ");
        InOrder(node.right);
    }

    //PostOrder Traversal: (Left, Root, Right)
    public void PostOrder(){
        PostOrder(root);
    }
    private void PostOrder(Node node){
        if(node == null){
            return;
        }
        InOrder(node.left);
        InOrder(node.right);
        System.out.println(node.value + " ");
    }
}
