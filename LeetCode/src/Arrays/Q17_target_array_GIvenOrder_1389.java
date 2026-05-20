package Arrays;

import java.util.*;

public class Q17_target_array_GIvenOrder_1389 {
    static void main() {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1,};

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            list.add(index[i],nums[i]);
        }

        int[] arr = new int[nums.length];
        for(int j=0; j<list.size(); j++){
            arr[j] = list.get(j);
        }
        System.out.println(Arrays.toString(arr));
    }
}
