package string;
import java.util.Scanner;

public class Q1_Roman_Integer_13 {
        static void main() {
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        Example 3:
//
//        Input: s = "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

            Scanner sc = new Scanner(System.in);
            System.out.println("Convert the Roman in integer:  ");
            System.out.print("Enter the roman number: ");

            String str = "iii".toUpperCase();
            int num=0,ans=0;
            for(int i = str.length()-1; i >= 0; i--){
                switch (str.charAt(i)){
                    case('I') -> num = 1;
                    case('V') -> num = 5;
                    case('X') -> num = 10;
                    case('L') -> num = 50;
                    case('C') -> num = 100;
                    case('D') -> num = 500;
                    case('M') -> num = 1000;
                }
                if(4*num < ans){
                    ans -= num;
                }
                else{
                    ans += num;
                }
            }
            System.out.println(ans);
        }
}
