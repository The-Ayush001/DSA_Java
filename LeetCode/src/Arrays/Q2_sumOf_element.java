package Arrays;
import java.util.Arrays;

public class Q2_sumOf_element {
     public static void main() {
//        Create a program to find the sum and average of all elements in an array.
         System.out.println("Sum & average of all element in array.");
         int arr[] ={1,2,3,4,5,6,7,8,9};
         System.out.println(Arrays.toString(arr));
//         Using for loop
         int sum=0,average=0;
         for(int element: arr){
             sum+=element;
         }
         average = sum/(arr.length);
         System.out.println("The sum of element of array is: "+sum);
         System.out.println("The average of element of array is: "+average);

    }
}
