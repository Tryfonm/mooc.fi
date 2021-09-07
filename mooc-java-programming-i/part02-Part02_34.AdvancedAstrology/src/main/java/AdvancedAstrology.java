
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquares(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void printMyTriangle(int size) {
        printSpaces(size);
        printStars(1);
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i * 2 + 1);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        printMyTriangle(height - 1);
//        printSpaces(height/2);
        printSpaces((height * 2 - 3) / 2);
        printRectangle(3, 1);
        printSpaces((height * 2 - 3) / 2);
        printRectangle(3, 1);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
    }
}
