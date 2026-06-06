package L48_Binary_Tree.BST;

public class Tree {
    static void main() {
        BST tree = new BST();
//        int[] treeNode = {5,2,7,1,4,6,9,8,3,10};
//        tree.populate(treeNode);

        int[] treeNode = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(treeNode);
        tree.display();
    }
}
