package Recursion;

public class Q1_Print_1_to_n {
    static void main() {
        System.out.println("printing 1 to 10 number:");
        num(10);
    }
    static void num(int n){
        if(n == 0){
            return;
        }
        num(n-1);
        System.out.println(n);
    }
}
