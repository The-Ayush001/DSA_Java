package Binary_Search;

import java.util.Arrays;

public class Q4_Missing_Number_268 {
    static void main() {
        int[] arr = {3,0,1};
        System.out.println(missing(arr));
    }
    static int missing(int[] arr){
        int i=0;
        while(i < arr.length){
            int j = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[j]){
                swap(arr,i,j);
            }
            else{
                i++;
            }
            System.out.println(Arrays.toString(arr));
        }
//        Search for first missing number
        for(int index=0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
//        case 2
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
