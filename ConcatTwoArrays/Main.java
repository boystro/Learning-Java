package ConcatTwoArrays;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };

        for (int data : arrCAT(arr1, arr2)) {
            System.out.printf("%d ", data);
        }
    }

    public static int[] arrCAT(int[] arr1, int[] arr2) {
        int arr1_size = Array.getLength(arr1);
        int arr2_size = Array.getLength(arr2);
        int[] return_arr = new int[arr1_size+arr2_size];

        for (int i = 0; i < arr1_size; i++) {
            return_arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2_size; i++) {
            return_arr[arr1_size + i] = arr2[i];
        }
        return return_arr;
    }
}
