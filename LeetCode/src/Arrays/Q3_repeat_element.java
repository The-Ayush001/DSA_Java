package Arrays;

import java.util.Arrays;

public class Q3_repeat_element {
    public static void main(String[] args){
//        Write a program to find number of occurrences of an element in array.
        System.out.println("Find number of occurrence of an element!");
        int array[] = {3,5,7,3,7,3,9,5,7,2,1,8,8};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//        Method:- 1
//        for(int i=0; i< array.length; i++){
//            int count=0;
//            if(i>0 && array[i-1] == array[i]){
//                continue;
//            }
//            for(int elem2: array){
//                if(array[i] == elem2){
//                    count++;
//                }
//            }
//            System.out.printf("%d are %d times \n",array[i],count);
//        }

//        Method:- 2
        int count = 1;

        for(int i = 1; i < array.length; i++){
            if(array[i] == array[i-1]){
                count++;
            } else {
                System.out.println(array[i-1] + " occurs " + count + " times");
                count = 1;
            }
        }

        // print last element count
        System.out.println(array[array.length - 1] + " occurs " + count + " times");
    }
}
