
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Statistics statisticsAll = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        while (true) {
            System.out.println("Enter numbers:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            statisticsAll.addNumber(number);
            if (number%2==0){
                statisticsEven.addNumber(number);
            }else{
                statisticsOdd.addNumber(number);
            }
        }
        System.out.println("Sum: " + statisticsAll.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
