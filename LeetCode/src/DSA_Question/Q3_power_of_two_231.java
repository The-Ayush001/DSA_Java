package DSA_Question;

public class Q3_power_of_two_231 {
    public static void main(String[] args){
        int n = 9;
        System.out.println(isPowerOfTwo(n));
    }
    static boolean isPowerOfTwo(int n) {
        int count=0;
        int num = n;
        while(n > 1){
            System.out.println(n);
            n = n / 2;
            count++;
        }
        return (Math.pow(2, count) == num);
    }
}
