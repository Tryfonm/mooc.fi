
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] pieces = input.split(" ");
            if (pieces[0].equals("add")) {
                if (Integer.valueOf(pieces[1]) >= 0) {
                    container1 += Integer.valueOf(pieces[1]);
                    if (container1 > 100) {
                        container1 = 100;
                    }
                }
            }
            if (pieces[0].equals("move")) {
                if (Integer.valueOf(pieces[1]) >= 0 && Integer.valueOf(pieces[1]) <= container1) {
                    container1 -= Integer.valueOf(pieces[1]);
                    container2 += Integer.valueOf(pieces[1]);
                    if (container2 > 100) {
                        container2 = 100;
                    }
                }
                else if (Integer.valueOf(pieces[1]) >= 0 && Integer.valueOf(pieces[1]) > container1) {
                    int toBeMoved = container1;
                    container1 = 0;
                    container2+= toBeMoved;
                    if (container2 > 100) {
                        container2 = 100;
                    }
                }
            }
            if (pieces[0].equals("remove")) {
                if (Integer.valueOf(pieces[1]) >= 0) {
                    container2 -= Integer.valueOf(pieces[1]);
                    if (container2 < 0) {
                        container2 = 0;
                    }
                }
            }
        }
    }
}
