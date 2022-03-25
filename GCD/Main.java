package GCD;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(String.format("GCD of %d and %d is %d.", num1, num2, GCD(Math.max(num1, num2), Math.min(num1, num2))));

        sc.close();
    }

    public static int GCD(int num1, int num2) {
        if (num1%num2==0)
            return num2;
        return GCD(num2, num1%num2);
    }
}