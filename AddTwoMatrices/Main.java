package AddTwoMatrices;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int[][] arr2 = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1},
        };

        int[][] resultMatrix = new int[Array.getLength(arr1)][Array.getLength(arr1[0])];

        
        for (int i = 0; i < Array.getLength(resultMatrix); i++) {
            for (int j = 0; j < Array.getLength(resultMatrix[0]); j++) {
                resultMatrix[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int[] row : resultMatrix) {
            for (int val : row) {
                System.out.print(String.format("%d\t", val));
            }
            System.out.print("\n");
        }

    }
}
