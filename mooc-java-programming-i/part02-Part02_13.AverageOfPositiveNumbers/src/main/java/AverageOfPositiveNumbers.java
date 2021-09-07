
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int c = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum = sum + number;
                c += 1;
            }
        }
        if (c != 0) {
            double avg = (double) sum / c;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
