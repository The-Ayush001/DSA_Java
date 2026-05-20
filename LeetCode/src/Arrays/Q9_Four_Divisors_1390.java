package Arrays;
import java.util.Arrays;

public class Q9_Four_Divisors_1390 {
    static void main() {
//        Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0.
//
//        Example 1:
//        Input: nums = [21,4,7]
//        Output: 32
//        Explanation:
//        21 has 4 divisors: 1, 3, 7, 21
//        4 has 3 divisors: 1, 2, 4
//        7 has 2 divisors: 1, 7
//        The answer is the sum of divisors of 21 only.
//        EXAMPLE 2:
//        Input: nums = [1,2,3,4,5]
//        Output: 0
        int[] nums = {7286,18704,70773,8224,91675};
        System.out.println(sumFourDivisors(nums));
    }
    static int sumFourDivisors(int[] nums){
        System.out.println(Arrays.toString(nums));
        int value = 0;  //final value
        int[] arr = new int[nums.length];
        int j =0;
        for(int num : nums){
            int sum=0, count=0;

            for(int i=1; i*i <= num; i++){
                if(num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;

                    if (d1 == d2) {
                        sum += d1;
                        count++;
                    } else {
                        sum += d1 + d2;
                        count += 2;
                    }
                    if (count > 4) {
                        break;
                    }
                }
            }
            value += sum;
        }
        return value;
    }
}
