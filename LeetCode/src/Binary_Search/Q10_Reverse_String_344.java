package Binary_Search;

import java.util.Arrays;

public class Q10_Reverse_String_344 {
    static void main() {
        char[] arr = {'A','y','u','s','h'};
        System.out.println(Arrays.toString(arr));
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseString(char[] s){
        useRecusrsion(s,0,s.length-1);
    }
    static void useRecusrsion(char[] s,int start,int end){
        if(start > (s.length-1)/2){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        useRecusrsion(s,start+1,end-1);
    }
}
