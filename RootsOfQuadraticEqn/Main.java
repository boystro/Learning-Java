package RootsOfQuadraticEqn;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter co-efficient of x2 : ");
        float a = sc.nextFloat();
        System.out.print("Enter co-efficient of x : ");
        float b = sc.nextFloat();
        System.out.print("Enter constant : ");
        float c = sc.nextFloat();

        float D = (float)Math.pow(b, 2) - 4*a*c;
        if ( D > 0 ) {
            float root1 = ((-b) + (float)Math.pow(D, 0.5))/(2*a);
            float root2 = ((-b) - (float)Math.pow(D, 0.5))/(2*a);
            System.out.print("Root 1 : ");
            System.out.println(root1);
            System.out.print("Root 2 : ");
            System.out.println(root2);
        } else if (D == 0) {
            float root = (-b) / (2*a);
            System.out.print("Unique root : ");
            System.out.println(root);
        } else {
            System.out.println("No Real roots exist.");
        }

        sc.close();
    }
}
