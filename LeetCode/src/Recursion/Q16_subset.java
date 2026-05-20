package Recursion;
import java.util.*;

public class Q16_subset  {
    static void main() {
        int[] arr = {1,2,3};
//        method 1
        System.out.println(subset(arr));
//        method 2
        System.out.println(subsets(arr));
//        method 3
        findSubset(arr,0,new ArrayList<>());
        System.out.println(res);
    }
//    method 1:
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
//    method 2:
     static List<List<Integer>> subsets(int[] num){
         List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList,new ArrayList<>(),num,0);
        return resultList;
     }

    static void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet, int[] num, int start){
//        Add the set to result set
        resultSets.add(new ArrayList<>(tempSet));

        for(int i=start; i < num.length; i++){
//            case of including the number
            tempSet.add(num[i]);

//            Backtrack the new subset
            backtrack(resultSets, tempSet, num, i+1);

//            case of not-include the number
            tempSet.remove(tempSet.size()-1);
        }
    }

//    method 3: Without using for loop
    static List<List<Integer>> res = new ArrayList<>();
    static void findSubset(int nums[], int index, List<Integer> sublist){
//        base case
        if(index == nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }
//        pick
        sublist.add(nums[index]);
        findSubset(nums, index+1, sublist);
//        While backtracking, we need to remove the last added element
        sublist.remove(sublist.size()-1);
//        no pick
        findSubset(nums, index+1,sublist);
//        since we have not added any element so, no need
//        to remove anything while backtracking
    }
}
