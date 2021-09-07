
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n" +
"What is the main character called?");
        String n = scanner.nextLine();
        System.out.println("What is their job?");
        String j = scanner.nextLine();
        System.out.println("Here is the story:\n" +
"Once upon a time there was "+ n +", who was "+ j +".\n" +
"On the way to work, "+ n +" reflected on life.\n" +
"Perhaps "+ n +" will not be "+ j +" forever.");

    }
}
