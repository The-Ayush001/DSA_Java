package Tree;
import java.util.*;

public class Q4_Zigzag_Level_OrderTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;  // false -> normal flow, true -> reverse
        while(!queue.isEmpty()){
            int size = queue.size();

            List<Integer> currentLevel = new ArrayList<>(size);
            for(int i = 0; i < size; i++){
                if(!reverse){ // reverse -> false,  normal flow
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);

                    if(currentNode.left != null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){
                        queue.addLast(currentNode.right);
                    }
                }if(!reverse){ // reverse -> false,  normal flow
                    TreeNode currentNode = queue.pollFirst();  // take the node form the first
                    currentLevel.add(currentNode.val);

                    if(currentNode.left != null){ // add first lest node
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right != null){  // then add right node
                        queue.addLast(currentNode.right);
                    }

                }
                else{ // reverse -> true, for reverse flow
                    TreeNode currentNode = queue.pollLast(); // take the node form the last
                    currentLevel.add(currentNode.val);

                    if(currentNode.right != null){  // add first right node
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left != null){  // then left node
                        queue.addFirst(currentNode.left);
                    }
                }
            }

            reverse = !reverse; // F -> T, T -> F
            result.add(currentLevel);
        }
        return result;
    }
}
