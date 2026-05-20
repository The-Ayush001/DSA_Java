package Arrays;

public class Q15_Number_OfGood_pair_1512 {
    static void main() {
        int[] arr = {1,1,1,1};
        System.out.println(goodPair(arr));
    }
    static int goodPair(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
        }
        return  count;
    }
}
