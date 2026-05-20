package string;

public class Q9_Add_String_415 {
    static void main() {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));
    }

    static String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;

        int max = Math.max(i,j);

        StringBuilder ans = new StringBuilder();

        while(max >= 0){
            if(i >= 0 && j >= 0){
                int x = num1.charAt(i--) - '0';
                int y = num2.charAt(j--) - '0';

                int sum = x + y;
                ans.append(sum);
            }else{
                // in this line error come so i fix it later.
//                ans.append(max);
            }

        }

        System.out.println(ans);
        System.out.println(ans);
        return "0";
    }
}
