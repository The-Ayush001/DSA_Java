package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q25_Rotate_Image_48 {
    //Rotate matrix without using another matrix.
    static void main() {
        int[][] mat = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
//        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] mat = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(mat));

        rotate(mat);
        System.out.println(Arrays.deepToString(mat));
    }
    static void rotate(int[][] mat){
        int n = mat.length;
        //Step 1: transpose
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //Step 2: reverse each row
        for(int i=0; i<n/2; i++){
            for(int j=0; j < n; j++){
                int temp = mat[j][i];
                mat[j][i] = mat[j][n-1-i];
                mat[j][n-1-i] = temp;
            }

        }
    }
}
