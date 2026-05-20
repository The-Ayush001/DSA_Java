package Arrays;

import java.util.Arrays;
public class Q8_Add_two_number {
    static void main() {
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]
        System.out.println(9999999+9999);
        int[] l1 = {9,9,9,9,9,9,9};
        int[] l2 = {9,9,9,9};
//        int[] l1 = {2,4,3};
//        int[] l2 = {5,6,4};
        System.out.println(Arrays.toString(add(l1,l2)));
    }
    static int[] add(int[] l1,int[] l2){
        int num1=0;
        int num2=0;
        for(int i=0; i<l1.length; i++){
            num1 = (num1*10+l1[i]);
        }
        for(int i=0; i<l2.length; i++){
            num2 = (num2*10+l2[i]);
        }
         int digit = count(num1,num2);
        int sum = num1+num2;

        int[] arr = new int[digit];
        for(int i=0; sum>0;i++){
            int rem = sum%10;
            arr[i]=rem;
            sum/=10;
        }
        return arr;
    }
    static int count(int num1,int num2){
        int sum = num1+num2;
        int count = 0;
        while(sum>0){
            count++;
            sum/=10;
        }
        return count;
    }
}
