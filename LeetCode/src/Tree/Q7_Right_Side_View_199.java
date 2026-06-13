package Tree;
import java.util.*;

public class Q7_Right_Side_View_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();  // stored the level node
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size(); // number of node in node.

            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();

                // i == size - 1 --> current are pointing the last node which are present in the queue
                if(i == size - 1){
                    list.add(current.val); // add the last node val in list.
                }

                if(current.left != null){
                    queue.offer(current.left);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
            }
        }
        return list;
    }
}
