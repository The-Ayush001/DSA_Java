package Arrays;
import java.util.*;

public class Q21_Disappeared_in_array_448 {
    static void main() {
//                    0 1 2 3 4 5 6 7
//        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {10,2,5,10,9,1,1,4,3,7};
        System.out.println(Arrays.toString(findMissing(nums)));
    }
    static int[] findMissing(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int j = arr[i] -1;
            if(arr[i] != arr[j]) {
                swap(arr,i,j);
            }
            else{
                i++;
            }
        }

//        finding the missing element
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                list.add(index + 1);
            }
        }
         int[] ans = new int[list.size()];
        for(int k=0; k<list.size();k++){
            ans[k] = list.get(k);
        }
        return ans;
    }
    static void swap(int[] arr,int fairs,int second){
        int temp = arr[fairs];
        arr[fairs] = arr[second];
        arr[second] = temp;
    }
}
