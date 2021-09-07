
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:?");
        int last = Integer.valueOf(scanner.nextLine());

        int fact = 1;
        if (last == 0){
            System.out.println("Factorial: " + fact);
        }
        for (int i = 1; i <= last; i++) {
            fact *= i;            
        }
        System.out.println("The sum is " + fact);
    }
}
