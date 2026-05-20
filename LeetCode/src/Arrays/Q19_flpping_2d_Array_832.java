package Arrays;

import java.util.Arrays;

public class Q19_flpping_2d_Array_832 {
    static void main() {
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(InvertArray(arr)));
    }
    static int[][] InvertArray(int[][] image){
        int n = image.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][n-1-j];
                image[i][n-1-j] = temp;




                if(image[i][n-1-j] == 0){
                    image[i][n-1-j] = 1;
                }
                else{
                    image[i][n-1-j] = 0;
                }
                 if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else {
                    image[i][j] = 0;
            }
        }
            System.out.println(Arrays.deepToString(image));
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(image[i][j] == 0){
//                    image[i][j] = 1;
//                }
//                else{
//                    image[i][j] = 0;
//                }
//            }
        }
        return image;
    }
}
