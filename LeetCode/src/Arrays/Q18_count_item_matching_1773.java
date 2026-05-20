package Arrays;
import java.util.*;

public class Q18_count_item_matching_1773 {
    static void main() {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));  //0
        items.add(Arrays.asList("phone", "silver", "lenovo"));  //1
        items.add(Arrays.asList("phone", "gold", "iphone"));  //2

        String ruleKey ="type";
        String ruleValue ="phone";

        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
//        if(ruleKey.equals("type")) index=0;
//        else if (ruleKey.equals("color")) index = 1;
//        else index = 2;   //for name

        int count = 0;
        for(int i=0;i<items.size();i++){
            List<String> list = new ArrayList<>();
            list = items.get(i);
            if(ruleValue.equals(list.get(index))){
                count++;
            }
        }
        return count;
    }
}
