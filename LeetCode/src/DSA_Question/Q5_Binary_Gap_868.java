package DSA_Question;

public class Q5_Binary_Gap_868 {
    static void main() {
        int num = 1;
        String str = (binary(num,""));
        System.out.println(str);
        System.out.println(count(str));
    }
    private static String binary(int n,String bi){
        bi = n%2 + bi;
        if(n < 2){
            return bi;
        }
        return binary(n/2 , bi);
    }
    private static int count(String  bin){
        int count = 0;
        for (int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1'){
                count++;
            }
        }
        return count > 1? adjacent(bin) : 0;
    }
    private static int adjacent(String  bin){
        int maxGap = 0;
        int priv = -1;
        for (int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1'){
                if(priv != -1){
                    maxGap = Math.max(maxGap, i-priv);
                }
                priv = i;
            }
        }
        return maxGap;
    }
}
