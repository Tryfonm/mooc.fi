
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String fileName = String.valueOf(scanner.nextLine());
        System.out.println("Team:");
        String teamName = String.valueOf(scanner.nextLine());

        int countGames = 0;
        int countWins = 0;
        int countLosses = 0;

        try ( Scanner fileScanner = new Scanner(Paths.get(fileName));) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] pieces = row.split(",");

                if (teamName.equals(pieces[0])) {
                    countGames++;
                    if (Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])) {
                        countWins++;
                    } else if (Integer.valueOf(pieces[2]) < Integer.valueOf(pieces[3])) {
                        countLosses++;
                    }
                } else if (teamName.equals(pieces[1])) {
                    countGames++;
                    if (Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])) {
                        countLosses++;
                    } else if (Integer.valueOf(pieces[2]) < Integer.valueOf(pieces[3])) {
                        countWins++;
                    }
                }
            }
            System.out.println("Games: " + countGames);
            System.out.println("Wins: " + countWins);
            System.out.println("Losses: " + countLosses);
        } catch (Exception e) {
            System.out.println("GAMISE TA PALI");
        }
    }
}
