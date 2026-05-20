package backtracking;

public class Q1_max_product_matrix_1594 {
    static void main() {                                 //        --->
//    int[][] mat = {{-1,-2,-3},{-2,-3,-3},{-3,-3,-2}};
    int[][] mat = {{1,-2,1},{1,-2,1},{3,-4,1}};
//        int[][] mat = {{1,3},{0,-4}};
        System.out.println(maxProduct(mat));
    }
    static int maxProduct(int[][] mat){
        return findProduct(mat, 0, 0, 1);
    }
    static int findProduct(int[][] mat, int row, int col, int product){
        //Base case
        if (row >= mat.length || col >= mat[0].length) {
            return -1;
        }
        if(row == mat.length-1 && col == mat[0].length-1){
            int ans = product * mat[row][col];
            return ans >=0 ? ans : -1;
        }

        int currentProduct = product * mat[row][col];
        int down = findProduct(mat, row+1,col,currentProduct);
        int right = findProduct(mat, row, col+1,currentProduct);
        return Math.max(down,right);
    }
}
