package Binary_Search;

public class Q8_valid_square_367 {
    static void main() {
//        not use sqrt().
        int num=1;
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
        int i = 1;
        int j = num/2 +1;
        while (i <= j){
            int mid = i + (j-i)/2;
            if(mid*mid == num){
                return true;
            }
            if(mid*mid < num){
                i = mid+1;
            }
            else{
                j = mid-1;
            }

        }
        return false;
    }
}
