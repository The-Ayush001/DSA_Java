package Recursion;
import java.util.ArrayList;

public class Q15_Subseq {
    static void main() {
        String str = "abc";

        subseq("", str);
        System.out.println(subseqRet("",str));

    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }
//    Represent the subset in the form of array
    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqRet(p+ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));
        left.addAll(right);

        return left;
    }
}
