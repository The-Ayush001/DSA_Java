package backtracking;                                    // |
                                                         //  --->
public class Q2_product_of_matrix {                      //       |
    static void main() {                                 //        --->
//    int[][] mat = {{-1,-2,-3},{-2,-3,-3},{-3,-3,-2}};
    int[][] mat = {{1,-2,1},{1,-2,1},{3,-4,1}};
//        int[][] mat = {{1,3},{0,-4}};
        maxProduct(mat);
    }
    static void maxProduct(int[][] mat){
        findProduct(mat,0,0,1);
    }
    static void findProduct(int[][] mat, int row, int col,int ans){

        // base case
        if(row == mat.length-1 && col == mat[0].length-1){
            int finalAns = ans * mat[row][col];
            if(finalAns >= 0){
                System.out.println(ans * mat[row][col]);
            }else{
                System.out.println("-1");
            }
            return;
        }
        if(row < mat.length && col == row){
            findProduct(mat, row+1, col, ans*mat[row][col]);
        }
        if(col < mat.length ){
            findProduct(mat, row, col+1, ans*mat[row][col]);
        }
    }
}
