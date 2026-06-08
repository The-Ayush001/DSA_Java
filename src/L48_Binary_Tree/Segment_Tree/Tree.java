package L48_Binary_Tree.Segment_Tree;

public class Tree {
    static void main() {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        segmentTree tree = new segmentTree(arr);

//        tree.display();

        System.out.println(tree.query(1, 6));
    }
}
