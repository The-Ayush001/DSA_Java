package DSA_Question;
import java.util.*;

public class Q1_MergeTow_SortedList_21 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 4);
        List<Integer> list2 = Arrays.asList(1, 3, 4);
        System.out.println(mergeTwoLists(list1,list2));
    }
    static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2){
        List<Integer> list = new ArrayList<>();
        int l1Size = list1.size();
        int l2Size = list2.size();
        int j=0;
        for(int i=0; i < l1Size; i++){
            while((j < l2Size) && (list1.get(i) >= list2.get(j))){
                    list.add(list2.get(j));
                    j++;
            }
            list.add(list1.get(i));
        }
        return list;
    }
}
