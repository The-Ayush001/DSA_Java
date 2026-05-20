package Binary_Search;

public class Q2_smallest_letter_744 {
    static void main() {
//        Find Smallest letter grater than target
//        Binary Search
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(smallestLetter(letters,target));
    }
    static char smallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < letters[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
