package backtracking;
import java.util.*;

public class Q6_Combination_Sum_216 {
    static void main() {
        int k = 3;
        int n = 9;
        System.out.println(combinationSum3(k, n));
    }
    static List<List<Integer>> finalList = new ArrayList<>();

    static List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();
        findCombination(k, n, list, 0, 1);

        return finalList;
    }
    static void findCombination(int k, int n, List<Integer> list, int sum, int index){
        // Base condition
        if(list.size() == k){
            if(sum == n){
                finalList.add(new ArrayList(list));
            }
            return;
        }

        for (int i = index; i <= 9; i++) {
            if(sum+i > 9){
                break;
            }
            list.add(i);

            findCombination(k, n, list, sum+i, i+1);

            // Backtracking
            list.remove(list.size()-1);

        }
    }
}
