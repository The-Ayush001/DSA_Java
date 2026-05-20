package Recursion;

import java.security.spec.RSAOtherPrimeInfo;

public class Q11_Triangle_ptrn {
    static void main() {
        triangle(4,0);
        triangle2(4,0);
    }
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            triangle(r,c+1);
        }else {
            System.out.println("");
            triangle(r-1,0);
        }
    }
    static void triangle2(int r,int c){
        if(r == 0){
            return;
        }
        if(r > c){
            triangle2(r,c+1);
            System.out.print("* ");
        }else {
            triangle2(r-1,0);
            System.out.println("");
        }
    }
}
