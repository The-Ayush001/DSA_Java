package Arrays;
import java.util.Arrays;

public class Q1_missing_element {
    public static void main(String[] args){
        int[] arr = {7,4,3,9,1,5,2,6};
        Arrays.sort(arr); // arrange the array
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing element: "+missingNum(arr));
    }
     static int missingNum(int arr[]) {
         int num = 1;
         for(int element: arr){
             if(num != element){
                 return num;
             }
             num++;
         }

        return 0;
    }
}
