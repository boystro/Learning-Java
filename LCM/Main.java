package LCM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(String.format("LCM of %d and %d is %d.", num1, num2, LCM(num1, num2)));

        sc.close();
    }

    public static int LCM(int num1, int num2) {
        int lcm = Math.min(num1, num2);

        while (true) {
            if (lcm%num1==0 && lcm%num2==0)
                break;
            lcm++;
        }
        
        return lcm;
    }
}
