package Arrays;

import java.util.Arrays;

public class Q31_Left_Right_Diff_2574 {
    static void main() {
        int[] nums = {10,4,8,3};
        int [] ans = leftRightDifference(nums);
        System.out.println(Arrays.toString(ans));
    }

    // Method: 1, Optimize Code (TC: O(N))
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < n; i++){
            rightSum += nums[i]; // sum to the array element.
        }

        for(int i = 0; i < n; i++){
            rightSum -= nums[i]; //  total = total sum - current value

            ans[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i]; // sum of privies value current value
        }

        return ans;
    }

    // Method: 2, Brute Force Approach (TC: O(N^2))

    // public static int[] leftRightDifference(int[] nums) {
    //     int n = nums.length;
    //     int[] ans  = new int[n];

    //     // Brute Force Approach (TC: O(n^2))

    //     for(int i=0; i < n; i++){
    //         int leftSum = findSum(nums, 0, i);  // sum of  element to the left of the index.
    //         int rightSum = findSum(nums, i+1, n);  // sum of element to the right of the index.

    //         ans[i] = Math.abs(leftSum - rightSum);
    //     }

    //     return ans;
    // }

    // // find the sum.
    // public int findSum(int[]nums, int s, int e){
    //     int sum  = 0;
    //     for(int i = s; i < e; i++){
    //         sum += nums[i];
    //     }
    //     return sum;
    // }
}
