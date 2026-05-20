package DSA_Question;

public class Q2_Sub_product_sum_1281 {
    static void main() {
        int n = 234;
        int product = 1;
        int sum =0;
        while(n > 0){
            product = product*(n%10);
            System.out.println(n%10);
            System.out.println(n/10);
            sum += (n%10);
            n/=10;
        }
        System.out.println(product);
        System.out.println(sum);
        System.out.println(product-sum);
    }
}
