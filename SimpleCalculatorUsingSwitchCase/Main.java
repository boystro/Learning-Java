package SimpleCalculatorUsingSwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) Add\n2) Subtract\n3) Multiply\n4) Divide");
        System.out.print("Enter operation: ");
        int choice = sc.nextInt();

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(String.format("%d + %d = %d", num1, num2, num1+num2));
                break;
        
            case 2:
                System.out.println(String.format("%d - %d = %d", num1, num2, num1-num2));
                break;
        
            case 3:
                System.out.println(String.format("%d * %d = %d", num1, num2, num1*num2));
                break;
        
            case 4:
                System.out.println(String.format("%d / %d = %d", num1, num2, num1/num2));
                break;
        
            default:
                System.out.println("Enter valid option.");
                break;
        }

        sc.close();
    }
}
