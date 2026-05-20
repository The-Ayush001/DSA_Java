package Binary_Search;
import java.util.*;

public class Q6_All_Duplicate_number_442 {
    static void main() {
        int[] arr = {1,1,2};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
                int j = nums[i] - 1;
                if(nums[i] != nums[j]){
                    swap(nums,i,j);
                }
                else{
                    i++;
                }
        }

        for (int x = 0; x < nums.length; x++) {
            if(nums[x] != x+1){
                list.add(nums[x]);
            }
        }
        System.out.println(Arrays.toString(nums));

        return list;
    }
    static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
