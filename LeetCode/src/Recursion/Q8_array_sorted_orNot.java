package Recursion;

public class Q8_array_sorted_orNot {
    static void main() {
//        int[] arr = {1,2,3,4,5,6};
        int[] arr = {1,2,5,4,3,6};

        System.out.println(sortOrNot(arr,0) ? "Array is sorted" : "Array is not sorted");
    }
//    static boolean sortOrNot(int[] arr){
//        return helper(arr,0);
//    }
    static boolean sortOrNot(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return (arr[index] < arr[index+1] && sortOrNot(arr,index+1));
    }
}
