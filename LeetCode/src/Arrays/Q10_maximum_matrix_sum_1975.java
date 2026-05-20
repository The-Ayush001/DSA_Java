package Arrays;

public class Q10_maximum_matrix_sum_1975 {
    static void main() {
//        int[][] matrix = {{-10000,-10000,-10000},{-10000,-10000,-10000},{-10000,-10000,-10000}};
        int[][] matrix = {{1,2,3},{-1,-2,-3},{1,2,3}};
        int count = 0;
        long sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                if(value < 0){
                    count++;
                    sum = sum+(-1*value);
                }else{
                    sum +=value;

                }
                if(Math.abs(value) < min){
                    min = Math.abs(value);
                }
            }
        }
        if(count % 2 != 0){
            System.out.println( sum - 2L * min);

        }
        else {
            System.out.println(sum);
        }
    }
}
