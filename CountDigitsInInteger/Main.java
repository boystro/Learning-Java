package CountDigitsInInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;

        while (temp>0) {
            count++;
            temp /= 10;
        }

        System.out.println(String.format("%d has %d digits.", num, count));

        sc.close();
    }
}
