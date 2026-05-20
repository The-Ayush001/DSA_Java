package DSA_Question;

public class Q6_reverse_integer {
    static void main() {
//        int x = 123;
//        int x = -120;
        int x = 1534236469;
//        int x = 2147483641;
        System.out.println(x);
        System.out.println(reverse(x));
    }
    static int reverse(int x) {

        int ans =0;
        while( Math.abs(x) > 0 ){
            int digit = x%10;
            if(ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && digit < -8)){
                return 0;
            }
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit > 7)){
                return 0;
            }

            ans = (ans*10) + digit;
            x = x/10;
        }

        return  ans;
    }
}
