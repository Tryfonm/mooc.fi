
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> archive = new ArrayList<Item>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = String.valueOf(scanner.nextLine());
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = String.valueOf(scanner.nextLine());
            if (name.equals("")) {
                break;
            }
            Item candidate = new Item(identifier, name);

            boolean alreadyIn = false;
            for (Item item : archive) {
                if (item.equals(candidate)) {
                    alreadyIn = true;
                }
            }
            if (alreadyIn == false) {
                archive.add(candidate);
            }
        }
        for (Item item : archive) {
            System.out.println(item);
        }
    }
}
