import java.util.Arrays;

public class Maxin2darray {

    // Find the maximum element in the given 2D array.

    public static void main(String[] args) {
        int [][] arr = {{1,2,3},
                {5,7,16,98},
                {9,855,4}};
        int ans = Search(arr); // the output will be the element value
        System.out.println(ans);
    }

    static int Search(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }

        }
        return max;
    }
}
