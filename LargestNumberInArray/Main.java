package LargestNumberInArray;

public class Main {
    public static void main(String[] args) {
        int[] ar = {20, 30, 50, 70, 90, 55, 65, 45, 100, 25, 69, 14};
        int max = ar[0];
        for (int digit : ar) if (digit > max) max = digit;
        System.out.println(String.format("Max is %d", max));
    }
}
