package Arrays;

public class Q29_SubArray {
    static void main() {
        // find the sub array.
        int[] arr = {1,2,3,4,5};

        // Using the brute force approach  O(n^3)
        for(int st = 0; st < arr.length; st++){

            for(int end = st; end < arr.length; end++){

                for(int i = st; i <= end; i++){
                    System.out.print(arr[i] );
                }
                    System.out.print(", ");
            }
            System.out.println(" ");
        }
    }
}
