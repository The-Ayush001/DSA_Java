package Binary_Search;
import java.util.*;

public class Q5_Duplicate_number_287 {
    static void main() {
        int[]arr = {1,3,4,2,2};
//        int[]arr = {3,1,3,4,2};
//        int[]arr = {3,3,3,3,3};
        System.out.println( dublicateNo(arr));
    }
    static int dublicateNo(int[] nums){
        int i=0;
        while(i < nums.length){
            if(nums[i] != i+1){
                int j = nums[i]-1;
                if(nums[i] != nums[j]){
                    swap(nums,i,j);
                }
                else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return -1;
    }
    static void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
