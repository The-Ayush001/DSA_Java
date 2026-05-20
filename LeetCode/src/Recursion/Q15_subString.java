package Recursion;

public class Q15_subString {
    static void main() {
        String s = "bacapplecad";
        String p="";
        System.out.println(s);
        System.out.println(subString(p,s));
        System.out.println(skip(s));
        System.out.println(skipApple("bacapplecad"));
        System.out.println(skipAppNotApple("baappledappkj"));
    }
//    method 1
    static String subString(String p, String q){
        if(q.isEmpty()){
            return p;
        }
        if(q.charAt(0) != 'a'){
            p = p+q.charAt(0);
        }
        return subString(p,q.substring(1));
    }
//    method 2
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }else {
            return ch + skip(up.substring(1));
        }
    }
//    remove apple word in string
    static String skipApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        return up.charAt(0) + skipApple(up.substring(1));
    }
//    remove app but not even its apple
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
