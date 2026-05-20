package Arrays;

import java.util.Arrays;

public class Q13_Minimum_Operation_findElement_3065 {
    static void main() {
//        int[] arr={2,11,10,1,3};
//        int[] arr={1,1,2,4,9};
//        int[] arr={1,1,2,4,9};
        int[] arr={760340387,289254123,628299234,204198715,565672759,684967229,303459334,302262994,770720781,383343826,148523784,750183433,778902176,930418501,520286131,441750197,402643198,547480026,799770607,303114486,481644752,320289220,792197603,44751343,828179295,804048578,468569446,555743704,416141129,865011209,56010709,133835994,200083188,740956911,842527451,728469270,370323078,880010797,977376598,598070033,866374140,110775975,609860085};
        int target=377260496;
        System.out.println(Arrays.toString(arr));
        System.out.println(minOperations(arr,target));
    }
    static int minOperations(int[] nums, int k){
        int minOperation=0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int ele: nums){
            if(ele >= k){
                break;
            }
            else {
                minOperation++;
            }
        }
        return minOperation;
    }
}
