
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int c = 0;
        while (true) {
            Integer userInput = Integer.valueOf(scanner.nextLine());
            if (userInput.equals(0)) {
                break;
            }
            if (userInput > 0) {
                sum += userInput;
                c++;
            }
        }
        if (c != 0) {
            System.out.println(sum / c);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
