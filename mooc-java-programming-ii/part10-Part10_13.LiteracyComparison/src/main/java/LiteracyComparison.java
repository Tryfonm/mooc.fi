
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.replace(" (%)", ""))
                    .map(row -> row.split(","))
                    .sorted((row1, row2) -> {
                        return row1[5].compareTo(row2[5]);
                    })
                    .forEach(row -> System.out.println(row[3] + " (" + row[4] + ")" + "," + row[2] + ", " + row[5]));
        } catch (Exception e) {
            System.out.println("GAMISE TA");
        }
    }
}
