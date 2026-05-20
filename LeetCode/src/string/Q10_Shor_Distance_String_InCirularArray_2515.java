package string;

import java.util.ArrayList;

public class Q10_Shor_Distance_String_InCirularArray_2515 {
    static void main() {
        String[] StrArray = {"hello","i","am","leetcode","hello"};
        String target = "hello";
        System.out.println(closestTarget(StrArray, target, 1));

    }
    static int closestTarget(String[] words, String target, int startIndex) {
        // Storing the distance  between target and element
        ArrayList<Integer> list = new ArrayList<>();
        int min = -1;
        int n = words.length;

        for (int i = 0; i < n; i++) {
            if (target.equals(words[i])) {
                // main formule

                int direct = Math.abs(i - startIndex);
                int circular = n - direct;
                list.add(Math.min(direct, circular));

            }
        }
        if (list.size() > 0) {
            min = list.get(0);

            //finding the minimum distance between target and element
            for (int j = 1; j < list.size(); j++) {
                min = Math.min(min, list.get(j));
            }
        }

        return min;
    }
}
