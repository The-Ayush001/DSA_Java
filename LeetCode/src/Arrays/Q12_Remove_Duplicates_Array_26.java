package Arrays;

import java.util.Arrays;

public class Q12_Remove_Duplicates_Array_26 {
    static void main() {
//        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] arr = {1,1,1};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums){
        int k=0;
        int length = nums.length;
        if(length == 1){
            nums[k]=nums[0];
            k++;
        }
        else{
            for(int i=1; i < length; i++) {
                if (nums[i - 1] != nums[i]) {
                    nums[k] = nums[i - 1];
                    k++;
                    if (i == length - 1) {
                        nums[k] = nums[i];
                        k++;
                    }
                }
                else{
                    if(i == length - 1){
                        nums[k] = nums[i];
                        k++;
                    }
                }
            }
            for(int j=k; j < length; j++){
                nums[j] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
