package PrimeNumbersInInterval;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lower Limit and Upper Limit: ");
        int lowerLim=sc.nextInt(), upperLim = sc.nextInt();
        System.out.println(String.format("The following are prime numbers between %d and %d", lowerLim, upperLim));
        if (lowerLim < 2) {
            System.out.println(String.format("%d is too low, defaulting to 2", lowerLim));
        }
        for (int i=lowerLim; i<upperLim; i++) {
            if (isPrime(i)) System.out.print(String.format("%d ", i));
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        for (int i=2; i<=(int)Math.pow(num, 0.5); i++) if (num%i==0) return false;
        return true;
    }
}
