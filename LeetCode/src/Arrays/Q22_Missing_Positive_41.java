package Arrays;

public class Q22_Missing_Positive_41 {
    static void main() {
//        int[] arr = {1,2,0};
//        int[] arr = {3,4,-1,1};
        int[] arr = {7,8,9,11,12};
        System.out.println(missingPositive(arr));

    }
    static int missingPositive(int[] nums){
        int i = 0;
        while(i < nums.length){
            int j = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[j]){
                swap(nums, i, j);
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
