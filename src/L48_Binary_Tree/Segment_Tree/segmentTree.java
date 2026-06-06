package L48_Binary_Tree.Segment_Tree;

public class segmentTree {
    private static class Node{
        int startInterval;
        int endInterval;
        int data;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    private Node root;

    public segmentTree(int[] arr ){
        //
        root = constructTree(arr, 0, arr.length - 1);
    }
    private Node constructTree(int[] arr, int start, int end){
        if(start == end){
            // leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        // creating the node with index you are at
        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    // display:
    public void display(){
        display(this.root);
    }
    private void display(Node  node){
        String str = "";

        if(node.left != null){
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and date: " + node.left.data + " => ";
        }
        else{
            str = str + "No left child";
        }

        //for current node

    }
}
