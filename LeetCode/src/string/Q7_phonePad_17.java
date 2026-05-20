package string;
import java.awt.List;
import java.util.*;

public class Q7_phonePad_17 {
    static void main() {
        pad("","23");
        System.out.println(padRet("","7"));
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
//    ans in form of list
    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i=(digit - 2)*3; i < (digit-1)*3; i++){
            char ch = (char) ('a' + i);
            list.addAll(padRet(p+ch, up.substring(1)));
        }
        return list;
    }
}
