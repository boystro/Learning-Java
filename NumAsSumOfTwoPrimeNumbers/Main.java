package NumAsSumOfTwoPrimeNumbers;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i=2;i<num/2;i++) {
            if (isPrime(i)) {
                if (isPrime(num-i)) {
                    System.out.println(String.format("%d = %d + %d", num, i, num-i));
                    sc.close();
                    return;
                }
            }
        }
        System.out.println(String.format("%d can not be represented as sum of two primes", num));
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num==0 || num==1) return false;
        for (int i=2; i<(int)Math.sqrt(num); i++)
            if (num%i==0)
                return false;
        return true;
    }
}
