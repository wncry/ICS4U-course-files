import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] arr2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int end_size = arr1.length; // cols in arr1 = rows in arr2

        int[][] arr3 = new int[end_size][end_size];

        for (int end_row=0; end_row < end_size; end_row++) {
            for (int end_col=0; end_col < end_size; end_col++) {
                for (int size=0; size < end_size; size++) { 
                    arr3[end_row][end_col] += arr1[end_row][size]*arr1[size][end_col];
                }
            }
        }

        for (int[] row: arr3) {
            System.out.println(Arrays.toString(row));
        }

        
    }
}