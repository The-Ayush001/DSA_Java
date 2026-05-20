package Recursion;

public class Q12_findTarget_binary_704 {
    static void main() {
        int [] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(arr,target));
    }
    static int search(int[] nums, int target) {
            return findIndex(nums, target, 0, nums.length-1);
        }
    static int findIndex(int[] arr, int target, int start, int end){
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(start > end){
            return -1;
        }
        if(arr[mid] > target){
            return findIndex(arr, target, start, mid-1);
        }else{
            return findIndex(arr, target, mid+1,end);
        }
    }
}
