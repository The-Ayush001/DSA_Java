package Arrays;
import java.util.Arrays;
// with using another 2D matrix.
public class Q23_rotate_matrix {
    static void main() {
        int n = 3;
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] matrix : mat){
        System.out.println(Arrays.toString(matrix));
        }
        rotate(mat);
    }

    static void rotate(int[][] matrix){
        int size = matrix.length;
        int[][] rotate = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                rotate[j][size-1-i] = matrix[i][j];
            }
        }
        System.out.println("After 90 degree rotation:");
        for(int[] newMatrix : rotate){
            System.out.println(Arrays.toString(newMatrix));
        }
    }
}
