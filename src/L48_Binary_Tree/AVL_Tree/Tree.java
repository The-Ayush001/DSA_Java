package L48_Binary_Tree.AVL_Tree;

import L48_Binary_Tree.BST.BST;

public class Tree {
    static void main() {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//
//        tree.populate(scanner);
//        tree.display();
//        tree.prettyDisplay();

        BST tree = new BST();
//        int[] treeNode = {5,2,7,1,4,6,9,8,3,10};
//        tree.populate(treeNode);

        int[] treeNode = {1,2,3,4,5,6,7,8,9,10};
        tree.populateSorted(treeNode);
        tree.display();
    }
}
