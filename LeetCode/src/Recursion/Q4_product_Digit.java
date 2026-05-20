package Recursion;

public class Q4_product_Digit {
    static void main() {
        System.out.println("Find the product of digit: ");
        int num = 1342;
        System.out.printf("Product of digit is: %d",prod(num));
    }
    static int prod(int num){
        if(num%10 == num){
            return num;
        }
        return (num%10)*prod(num/10);
    }
}
