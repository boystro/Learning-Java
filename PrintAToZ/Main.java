package PrintAToZ;

public class Main {
    public static void main(String[] args) {
        for (int i='A'; i <= 'Z'; i++) {
            System.out.println(String.format("%c ", i));
        }
    }
}
