package Recursion;

public class Q3_sum_of_digit {
    static void main() {
        int num = 1342;
        System.out.println(sum(num));
    }
    static int sum(int num){
        if(num == 0){
            return num;
        }
        return  (num % 10) + sum(num / 10);

    }
}
