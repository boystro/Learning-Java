package SumOfNaturalNumbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term : ");
        int n = sc.nextInt();

        System.out.print(String.format("Sum of %d natural numbers is %d", n, sumNatNum(n)));

        sc.close();
    }

    public static int sumNatNum(int n) {
        if (n==0) return 0;
        return sumNatNum(n-1) + n;
    }
}
