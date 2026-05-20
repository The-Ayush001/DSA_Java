package Binary_Search;
import java.util.*;

public class Q7_Set_Mismatch_645 {
    static void main() {
//        int[] nums = {1,2,2,4};
//        int[] nums = {1,1};
        int[] nums = {3,2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }
    static int[] findErrorNums(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int x = 0;
        while(x < nums.length){
            int current = nums[x]-1;
            if(nums[x] != nums[current]){
                swap(nums,x,current);
            }
            else{
                x++;
            }
        }
        for(int i=0 ; i< nums.length; i++){
            if(nums[i] != i+1){
                list.add(nums[i]);
                list.add(i+1);
            }
        }
        int[] arr = new int[list.size()];
        for(int j=0; j<arr.length; j++){
            arr[j] = list.get(j);
        }
        return arr;
    }
    static void swap (int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
