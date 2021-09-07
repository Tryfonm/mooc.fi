
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int c = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            sum = sum + number;
            c += 1;
        }
        if (c != 0) {
            double avg = (double) sum / c;
            System.out.println("Average of the numbers: " + avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
