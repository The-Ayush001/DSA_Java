package Arrays;
import java.util.Arrays;

public class Q4_max_minValue {
     public static void main() {
        int arr[] = {3,53,24,7,3,22,77,49,96};
         System.out.println(Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        using for each loop;
         for(int element: arr){
             if(max < element){
                 max = element;
             }
             else if(min > element){
                 min = element;
             }
         }
         System.out.println("minimum element in this array is "+min);
         System.out.println("maximum element in this array is "+max);
    }
}
