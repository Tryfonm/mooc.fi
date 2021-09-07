
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micha
 */
public class UserInterface {

    private final Scanner scanner;
    private final RecipeManager recipeManager;

    public UserInterface(Scanner scanner, RecipeManager recipeManager) {
        this.scanner = scanner;
        this.recipeManager = recipeManager;
    }

    public boolean readFile() {
        System.out.println("File to read:");
        String fileName = this.scanner.nextLine();

        ArrayList<String> tempRecipes = new ArrayList<>();

        // Read the file
        try ( Scanner fileScanner = new Scanner(Paths.get(fileName));) {

            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                tempRecipes.add(row);

                if (row.equals("")) {
                    recipeManager.createAndAddRecipe(tempRecipes);
                    tempRecipes.clear();
                }

            }
            // The last recipe won't be having "", so needs to be taken care of.
            recipeManager.createAndAddRecipe(tempRecipes);

            return true;
        } catch (Exception e) {
            System.out.println("Something went wrong!");
            return false;
        }
    }

    public void start() {
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program");

        while (true) {
            System.out.println("\nEnter command:");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                this.recipeManager.printRecipes();
            }
            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchTerm = this.scanner.nextLine();
                ArrayList<Recipe> foundRecipes = recipeManager.searchByName(searchTerm);
                for (Recipe recipe : foundRecipes) {
                    recipe.printRecipe();
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int maxCookingTime = Integer.valueOf(this.scanner.nextLine());
                ArrayList<Recipe> foundRecipes = recipeManager.searchByCookingTime(maxCookingTime);
                for (Recipe recipe : foundRecipes) {
                    recipe.printRecipe();
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = this.scanner.nextLine();
                ArrayList<Recipe> foundRecipes = recipeManager.searchByIngredient(ingredient);
                for (Recipe recipe : foundRecipes) {
                    recipe.printRecipe();
                }
            }
        }
    }
}
