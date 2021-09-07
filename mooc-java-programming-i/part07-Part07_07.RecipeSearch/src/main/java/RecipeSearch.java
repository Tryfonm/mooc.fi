
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeManager recipeManager = new RecipeManager();
        UserInterface ui = new UserInterface(scanner, recipeManager);

        boolean readFileWithoutError = ui.readFile();
        if (readFileWithoutError) {
            ui.start();
        }
    }
}
