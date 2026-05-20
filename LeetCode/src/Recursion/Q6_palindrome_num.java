package Recursion;

public class Q6_palindrome_num {
    static void main() {
        int num = 12321;
        System.out.println(palin(num) ? "Palindrome" : "Not Palindrome");
    }
    static boolean palin(int n){
        return n == rev(n);
    }
    static int rev(int n){
        int digit = (int)(Math.log10(n)+1);
        return helper(n,digit);
    }
    static int helper(int n,int arg){
        if(n%10 == n) return n;
        int rem = n%10;
        return (rem * (int)(Math.pow(10,arg-1)) + helper(n/10, arg-1));
    }
}
