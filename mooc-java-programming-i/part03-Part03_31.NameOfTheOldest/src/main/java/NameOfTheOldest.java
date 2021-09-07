
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = -1;
        String maxName = " ";
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            
            if (Integer.valueOf(pieces[1])>maxAge){
                maxAge = Integer.valueOf(pieces[1]);
                maxName = String.valueOf(pieces[0]);
            }
        }System.out.println("Name of the oldest: " + maxName);
        
    }
}
