package backtracking;
import java.util.*;
public class Q3_Combination_Sum_39 {
    static void main() {
//        int[] arr = {2,3,6,7};
        int[] arr = {2,3,5};
        int target = 8;
        System.out.println(combinationSum(arr,target));
    }
    // final ans
    static List<List<Integer>> rel = new ArrayList<>();

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();

         findCombination(candidates, target, list,0, 0);
         return rel;
    }

    static void findCombination(int[] candidates, int target, List<Integer> list,int ans, int index){

        //base condition
        if( ans == target){
             rel.add(new ArrayList<>(list));
             return;
        }
        if(ans > target){
            return;
        }

        for(int i=index; i  < candidates.length; i++){
//            ans += candidates[i];
            list.add(candidates[i]);

            findCombination( candidates, target, list, ans + candidates[i], i);

            // backtrack
//            ans -= candidates[i];
            list.remove(list.size()-1);

        }
    }
}
