package L48_Binary_Tree.BinaryTree;

import java.util.Scanner;

public class Tree {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        tree.populate(scanner);
        tree.display();
        tree.prettyDisplay();

    }
}
