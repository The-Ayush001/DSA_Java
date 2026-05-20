package string;

import java.util.*;

public class Q5_Reverse_String_344 {
    static void main() {
//        char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','n','n','a','h'};
        System.out.println(Arrays.toString(s));
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
//        int size = ;
        while(start < (s.length-1)/2){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
