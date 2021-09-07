
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int ins;
        while (true){
            System.out.println("Give a number:");
            ins = Integer.valueOf(scanner.nextLine());
            if (ins == 0){
                break;
            }
            count = count +1;
        }
        System.out.println("Number of numbers: " + count);
    }
}
