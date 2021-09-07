
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String message = String.valueOf(scanner.nextLine());

            if (message.equals("")) {
                break;
            }
            String[] pieces = message.split(" ");
            for (int i = 0; i < pieces.length; i++) {

                System.out.println(pieces[i]);

            }
        }

    }
}
