
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            if (pieces[0].equals("add")) {
                int amount = Integer.valueOf(pieces[1]);
                container1.add(amount);
            }
            if (pieces[0].equals("move")) {
                int amount = Integer.valueOf(pieces[1]);
                if (amount > container1.contains()) {
                    amount = container1.contains();
                }
                container1.remove(amount);
                container2.add(amount);
            }
            if (pieces[0].equals("remove")) {
                int amount = Integer.valueOf(pieces[1]);
                container2.remove(amount);
            }
        }
    }
}
