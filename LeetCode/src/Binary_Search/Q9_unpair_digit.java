package Binary_Search;

public class Q9_unpair_digit {
    static void main() {
//    int[] arr = {1,1,2,3,3,4,4,5,5,6,6,7,7};
//    int[] arr = {1,1,2,2,3,3,4,4,5,5,6,7,7};
//    int[] arr = {1,1,2,2,3,3,4,4,5,5,6};
    int[] arr = {1,2,2,3,3,4,4,5,5};
//    int[] arr = {1,1,2,2,3,3,4,4,5};

        System.out.println(binary(arr));
    }
    static int binary(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start+(end - start)/2;
            if(mid == start || mid == end){
                return arr[mid];
            }
            if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            if(mid%2 == 0){
                if(arr[mid] == arr[mid+1]){
                    start = mid;
                }else {
                    end = mid;
                }
            }else {
                if(arr[mid] == arr[mid+1]){
                    end = mid;
                }else {
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
