package backtracking;
import java.util.*;

public class Q5_Combination_Sum_40 {
    static List<List<Integer>> ans = new ArrayList<>();

    static void main() {
//        int[] arr = {10,1,2,7,6,1,5};
        int[] arr = {4,4,2,1,4,2,2,1,3};
//        int target = 8;
        int target = 6;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(combinationSum2(arr, target));
    }
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();

        findCombination(candidates, target, list, 0,0);

        return ans;
    }

    static void findCombination (int[] candidates, int target, List<Integer> list, int sum, int index){
        if(sum == target){
                ans.add(new ArrayList(list));
                return;
        }
        if(sum > target){
            return;
        }

        for(int i = index; i < candidates.length; i++){

            // ✅ skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            System.out.println(index + " "+ i);
//            System.out.println(i);

            list.add(candidates[i]);

            // ✅ FIX: use i + 1 (not ++index)
            findCombination(candidates, target, list, sum + candidates[i], i + 1);

            // backtracking.
            list.remove(list.size()-1);
        }
    }
}
