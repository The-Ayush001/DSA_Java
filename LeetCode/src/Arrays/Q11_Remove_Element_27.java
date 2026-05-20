package Arrays;
import java.util.Arrays;

public class Q11_Remove_Element_27 {
    static void main() {
        int[] arr={0,1,2,2,3,0,4,2};
        int value=2;
        System.out.println(Arrays.toString(removeElement(arr,value)));
    }
    static int[] removeElement(int[] nums,int val){
        int size = nums.length;
        int[] newArr = new int[size];
        int i=0;
        for(int element: nums){
            if(element != val){
                newArr[i] = element;
                i++;
            }
        }
        return newArr;
    }
}
