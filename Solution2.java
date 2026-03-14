public class NumberPyramid {
    private static final int PYRAMID_HEIGHT = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= PYRAMID_HEIGHT; i++) {
            for (int j = i; j < PYRAMID_HEIGHT; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

