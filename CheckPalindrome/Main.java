package CheckPalindrome;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = sc.next();

        if (isPalindrome(str)) {
            System.out.println(String.format("%s is Plaindrome.", str));
        } else {
            System.out.println(String.format("%s is Not Plaindrome.", str));
        }
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        char rev[] = str.toCharArray();
        int revLen = Array.getLength(rev);

        for (int i=0; i <= (int)(revLen/2); i++) {
            rev[i] = rev[revLen-i-1];
        }

        if (str.equals(String.valueOf(rev))) return true;
        return false;
    }
}
