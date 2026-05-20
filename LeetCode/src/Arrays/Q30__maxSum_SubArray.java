package Arrays;

public class Q30__maxSum_SubArray {
    static void main() {
        int[] arr = {3, -4, 5, 4, -1, 7, -8};

        int n = arr.length;
        int maxSum = 0;

        // using BRUTE FORCE Algorithm. O(n^2)
//        for(int st = 0; st < n; st++){
//            int sum = 0;
//            for(int end = st; end < n; end++){
//                sum += arr[end];
//                maxSum = Math.max(maxSum, sum);
//            }
//        }

        // suing the KADANE'S Algorithm. O(n)

        int currSum = 0;
        for(int i = 0; i < n; i++){
            currSum += arr[i];

            maxSum = Math.max(maxSum, currSum);

            if(currSum < 0){
                currSum = 0;
            }
        }

        System.out.println(maxSum);

    }
}
