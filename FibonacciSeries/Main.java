package FibonacciSeries;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n th term :");
        int n = sc.nextInt();
        System.out.println(String.format("Fibonacci till %d is.", n));
        for (int i = -1; i <= n; i++) {
            System.out.print(String.format("%d ", fib(i)));
        }
        sc.close();
    }

    public static int fib(int n) {
        if (n<=0) return 1;
        return fib(n-1) + fib(n-2);
    }
}
