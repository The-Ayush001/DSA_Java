package Arrays;
import java.util.*;

public class Q26_Intersection_2Arrays_349 {
    static void main() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }
        }

        // changeing the list into array.
        int[] arr = new int[list.size()];
        for(int k=0; k < list.size(); k++){
            arr[k] = list.get(k);
        }

        return arr;
    }
}
