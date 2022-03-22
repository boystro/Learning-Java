package LargestOf3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third Number: ");
        int num3 = sc.nextInt();

        System.out.print(Integer.max(num1, Integer.max(num2, num3)));
        System.out.println(" is the maximum of all.");
        sc.close();
    }
}
