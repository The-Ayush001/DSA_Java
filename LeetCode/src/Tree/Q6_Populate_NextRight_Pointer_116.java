package Tree;

public class Q6_Populate_NextRight_Pointer_116 {
    public Node connect(Node root) {
        if(root == null)  return null;

        Node leftMost = root; // left node of each level indicate.

        while(leftMost.left != null){
            Node current = leftMost;  // current are point of each level node.


            while(current != null){
                current.left.next = current.right;  // connecting the left child to right child

                if(current.next != null){
                    current.right.next = current.next.left; // connecting the child of different parent
                }

                current = current.next;
            }
            leftMost = leftMost.left;
        }

        return root;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
