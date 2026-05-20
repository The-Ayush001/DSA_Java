package Recursion;

import java.util.ArrayList;

public class Q9_target_element_Array {
    static void main() {
        int[] arr = {3,2,1,18,9,6,15,1};
//        int[] arr = {3,2,1,12,9,6,15};
        int target = 1;
        System.out.println("index at: "+findTarget(arr,target,0));

        findAllIndex(arr,target,0);
        System.out.println(list);

        System.out.println(AllIndexList(arr,1,0,new ArrayList<>()));
    }
    static int findTarget (int[] arr, int taget, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == taget){
            return index;
        }
        return  findTarget(arr,taget,index+1);
    }
// By creating the arraylist
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

//    returning the arraylist without creating it.
    static ArrayList<Integer> AllIndexList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return AllIndexList(arr,target,index+1,list);
    }

}
