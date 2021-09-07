
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = -1;
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            
            if (Integer.valueOf(pieces[1])>maxAge){
                maxAge = Integer.valueOf(pieces[1]);
            }
        }System.out.println("Age of the oldest: " + maxAge);
        
    }
}
