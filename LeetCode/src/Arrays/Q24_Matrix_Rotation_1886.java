package Arrays;

import java.util.Arrays;

public class Q24_Matrix_Rotation_1886 {
    static void main() {
//        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
//        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat,target,0));
    }
    static boolean findRotation(int[][] mat, int[][] target, int count) {
        int n = mat.length;
        int[][] newMatrix = new int[n][n];
        //Rotating the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n-1-i] = mat[i][j];
            }
        }
        if(Arrays.deepEquals(newMatrix,target)){
            return true;
        }else if(count==3){
           return false;
        }
        return findRotation(newMatrix , target, count+1);
    }
}
