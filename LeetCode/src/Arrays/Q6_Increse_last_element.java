package Arrays;
import  java.util.Arrays;

public class Q6_Increse_last_element {
    public static void main() {
//        Input: digits = [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//        Incrementing by one gives 123 + 1 = 124.
//        Thus, the result should be [1,2,4].
        int[] arr = {8,9,9,9};
        System.out.println(Arrays.toString(s(arr)));
    }
    static int[] s(int[] digits){
        for(int num=digits.length - 1; num <= 0; num++) {
            if (digits[num] != 9) {
                digits[num] += 1;
                return digits;
            }
//            digits[num];
        }
        digits = new int[digits.length + 1];
        digits[0] += 1;

        return digits;
    }
}
