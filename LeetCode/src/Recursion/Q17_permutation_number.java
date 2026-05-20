package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q17_permutation_number {
    static List<List<Integer>> resultList = new ArrayList<>();
    static void main() {
        int[] nums = {1,2,3};
        permutation(nums,new ArrayList<>());
        System.out.println(resultList);
    }
    static void permutation(int[] arr, ArrayList<Integer> tempList){
//        base case
        if(tempList.size() == arr.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int num : arr){
            if(tempList.contains(num)){
                continue;
            }
            //add the new element
            tempList.add(num);

//            go back to try other element
            permutation(arr,tempList);

//            Remove the element
            tempList.remove(tempList.size()-1);
        }
    }
}
