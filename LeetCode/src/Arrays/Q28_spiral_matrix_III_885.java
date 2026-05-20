package Arrays;
import java.util.*;

public class Q28_spiral_matrix_III_885 {
    static void main() {
//        int rows = 5;
//        int cols = 6;
//        int rStart = 1;
//        int cStart = 4;
        System.out.println((spiralMatrixIII(5,6,1,4)));
    }
        static ArrayList<ArrayList<Integer>> spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
            int top = rStart; //1->0
            int bottom = rStart; //1->2
            int left = cStart; //4->3
            int right = cols - 1; //5

            int[][] matrix = new int[rows][cols];
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int count = 1;

            while (left != 0 || top != 0 || bottom != cols - 1) {
                if (top >= 0) {
                    // left --> right
                    for (int col = left; col <= right; col++) {
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(bottom);
                        list1.add(col);
//                        matrix[bottom][col] = count++;
                        list.add(list1);
                    }
                }
                bottom++;

                if (bottom < rows) {
                    // right --> bottom
                    for (int row = top; row <= bottom; row++) {
//                        matrix[row][right] = count++;
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(row);
                        list1.add(right);
//                        matrix[bottom][col] = count++;
                        list.add(list1);
                    }
                }
                left--;

                if (bottom < rows) {

                    // bottom --> left
                    for (int col = right - 1; col >= left; col--) {
//                        matrix[bottom][col] = count++;
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(bottom);
                        list1.add(col);
//                        matrix[bottom][col] = count++;
                        list.add(list1);
                    }
                }
                top--;

                if (left >= 0) {

                    // left --> top
                    for (int row = left; row >= top; row--) {
//                        matrix[row][top] = count++;
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(row);
                        list1.add(top);
//                        matrix[bottom][col] = count++;
                        list.add(list1);
                    }
                }
            }

            return list;
        }

}
