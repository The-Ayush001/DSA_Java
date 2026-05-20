package DSA_Question;

public class A_grade {

//    Q1. write a program to print all combination of the given string Ex- ABC,ABC,BCA,CAB,CBA,BAC,ACB
    static void main() {
        String str = "ABC";
        permute(str, 0);
        System.out.println("" +
                "");
        permutations("","abc");
    }

    static void permute(String str, int index) {
        if (index == str.length()) {
            System.out.println(str);
            return;
        }

        for (int i = index; i < str.length(); i++) {
            str = swap(str, index, i);
            permute(str, index + 1);
            str = swap(str, index, i); // backtrack
        }
    }

    static String swap(String str, int i, int j) {
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }

//    method 2
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            permutations(f + ch + s, up.substring(1));
        }
    }
}
