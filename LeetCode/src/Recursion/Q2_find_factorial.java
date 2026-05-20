package Recursion;
import java.util.Scanner;

public class Q2_find_factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the factorion of a number:");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(fact(num));

    }
    static int fact(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        return num * fact(num-1);
    }
}
