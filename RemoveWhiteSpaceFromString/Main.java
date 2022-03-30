package RemoveWhiteSpaceFromString;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: \n");
        String str = sc.nextLine();
        String ret_str = "";

        for (char ch : str.toCharArray()) {
            if (Character.isWhitespace(ch))
                continue;
            ret_str = ret_str.concat(Character.toString(ch));
        }
        System.out.println(String.format("No White Space String is: \n%s", ret_str));
        sc.close();
    }
}
