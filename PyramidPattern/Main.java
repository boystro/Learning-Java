package PyramidPattern;

public class Main {
    public static void main(String[] args) {
        int pyramidSize = 5;

        for (int i = 0; i < pyramidSize; i++) {
            for (int j = 0 ; j < pyramidSize - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
