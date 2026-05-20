package Arrays;
import java.util.Arrays;

public class Q27_spiral_matrix_II {
    static void main() {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                matrix[top][col] = count++;
            }
            top++;
            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = count++;
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    matrix[bottom][col] = count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    matrix[row][left] = count++;
                }
                left++;
            }
        }

        return matrix;
    }
}
