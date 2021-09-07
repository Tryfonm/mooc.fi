
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {36, 131, 42, 41, 23, 68, 30, 54, 26, 30, 45, 68, 40, 40, 84, 12, 85, 128, 107, 30};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int c = 0;
        for (int number : array) {
            if (c != array.length - 1) {
                System.out.print(number + ", ");
            } else {
                System.out.println(number);
            }
            c++;
        }
    }
}
