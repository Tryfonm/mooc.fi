
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // toteuta ohjelmasi tänne
        ArrayList<String> numbersAsStrings = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbersAsStrings.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String positiveOrNegative = scanner.nextLine();
        if (positiveOrNegative.equals("p")) {
            double avg = numbersAsStrings.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number >= 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the numbers: " + avg);
        } else if (positiveOrNegative.equals("n")) {
            double avg = numbersAsStrings.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the numbers: " + avg);
        }else{
            System.out.println("No value present");
        }

    }
}
