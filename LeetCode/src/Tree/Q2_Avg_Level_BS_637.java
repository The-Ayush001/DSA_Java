package Tree;
import java.util.*;

// to calculate the average value of the level node.
public class Q2_Avg_Level_BS_637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        // creating the queue --> to store the root and child node;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // --> root node are store in the queue.

        while (!queue.isEmpty()){
            int size = queue.size();
            double sumOfNodeVal = 0; // storing the sum of node value by level.

            // calculate the sum of the node by level.
            for(int i = 0; i < size; i++){
                TreeNode currentNode = queue.poll();
                sumOfNodeVal += currentNode.val; // --> sum of node value by level.

                if(currentNode.left != null){ // if current node having left child.
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){  // if current node having right child.
                    queue.offer(currentNode.right);
                }
            }

            result.add( sumOfNodeVal / size); // avg -> sum of node value / no of node.
        }

        return result;
    }
}
