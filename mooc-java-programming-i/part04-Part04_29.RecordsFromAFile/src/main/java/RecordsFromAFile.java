
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(fileName));) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] words = row.split(",");
                System.out.println(words[0] + ", age: " + words[1] + " years");
            }
        } catch (Exception e) {
            System.out.println("E GAMITHIKE");
        }

    }
}
