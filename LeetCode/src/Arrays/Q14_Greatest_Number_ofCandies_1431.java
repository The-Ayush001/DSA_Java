package Arrays;
import java.util.ArrayList;
import java.util.List;

public class Q14_Greatest_Number_ofCandies_1431 {
    static void main() {
//        kid is index of candies arrays.
//        Give a candies array, and extra candies.
//        return true of false, that kid have the greatest or equal number of candies among all kids in the form of list.
//        you can give all extra candies to only one kid at a time.

        int[] candies = {12,1,12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
//        This loop is find the max value of the candies array;
        for(int ele : candies){
            if(max < ele) {
                max = ele;
            }
        }
        for(int ele: candies){
            if(ele+extraCandies < max){
                list.add(false);
            }
            else{
                list.add(true);
            }
        }

        return list;
    }

}
