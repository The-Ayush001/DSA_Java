package Recursion;

public class Q5_reverse_number {
    static int sum = 0;
    static void main() {
        int num = 12345;
        System.out.println(rev2(num));
    }
    static int rev1(int num){
        sum = sum*10+(num%10);
        if(num%10 == num){
            return num;
        }
        rev1(num/10);
        return sum;
    }

//    way 2
    static int rev2(int n){
//        sometimes you might need some additional variables in the argument
//        in that case, make another function
        int digit = (int)(Math.log10(n)) + 1;
        System.out.println(digit);
        return helper(n,digit);
    }
    private static int helper(int n, int digit){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(n/10,digit-1);
    }
}
