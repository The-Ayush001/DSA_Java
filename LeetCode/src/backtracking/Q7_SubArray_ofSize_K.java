package backtracking;

import java.util.*;

public class Q7_SubArray_ofSize_K {
    public static List<List<Integer>> list = new ArrayList<>();

    static void main() {
        int[] nums = {1,3,2};
        int k = 2;

        System.out.print("Finding the length of subArray: ");
        System.out.println(maxTotalValue(nums, k)); // call maxTotalValue method
        System.out.println(list);
    }

    public static long maxTotalValue(int[] nums, int k) {

        findSubArray(nums, k, new ArrayList(), 0);

        return list.size();
    }
    public static void findSubArray(int[] arr, int k, ArrayList<Integer> subList, int ind){
        // Base condition
        if(subList.size() == k){
            list.add(new ArrayList(subList));
            return ;
        }

        for(int i = ind; i < arr.length; i++){
            // insert the element of the array
            subList.add(arr[i]);

            findSubArray(arr, k, subList, i+1);

            // backtrack
            subList.remove(subList.size()-1);
        }

    }


}
