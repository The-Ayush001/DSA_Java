package Binary_Search;

public class Q1_Search_Insert_Position_35 {
    static void main() {
//        Given a sorted array of distinct integers and a target value, return the index if the target is found.
//        If not, return the index where it would be if it were inserted in order.
        int[] arr = {1,3,5,6};
        int targer=7;
        System.out.println(searchInsert(arr,targer));
    }
    static int searchInsert(int[] nums, int target){
        int index=0;
        for(int ele: nums){
            if(ele < target){
                index++;
            }
        }
        return index;
    }
}
