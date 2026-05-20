package Arrays;
import java.util.Arrays;

public class Q5_check_array_isSorted {
    public static void main(String[] args){
        int arr[] = {1,5,3,7,4,8,2,9,6,0};
        System.out.println(Arrays.toString(arr));
        if(isSorted(arr)){
            System.out.println("Given array is sorted..");
        }
        else{
            System.out.println("Given array is not sorted..");
        }

    }
    static boolean isSorted(int[] arr){
            boolean isSorted = false;
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                isSorted = false;
                break;
            }
            else {
                isSorted = true;
            }
        }
        return isSorted;
    }
}
