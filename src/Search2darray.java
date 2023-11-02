import java.util.Arrays;

public class Search2darray {

    // Search the given target in the 2D array.

    public static void main(String[] args) {
        int [][] arr = {{1,2,3},
                {5,7,16,98},
                {9,8,4}};
        int target = 98;
        int[] ans = Search(arr,target); // the output will be the index of {row,col}
        System.out.println(Arrays.toString(ans));
    }

     static int[] Search(int[][] arr, int target){
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col] == target){
                     return new int[]{row, col};
                 }
             }

         }
         return new int[]{-1,-1};
     }

}
