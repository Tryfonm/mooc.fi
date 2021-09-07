/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.ArrayList;

public class RecipeManager {

    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }

    public void createAndAddRecipe(ArrayList<String> listOfStrings) {

        Recipe newRecipe = new Recipe(listOfStrings.get(0), Integer.valueOf(listOfStrings.get(1)));
        for (int i = 2; i < listOfStrings.size(); i++) {
            newRecipe.addIgredient(listOfStrings.get(i));
        }
        this.recipes.add(newRecipe);
    }

    public void printRecipes() {
        for (Recipe recipe : this.recipes) {
            recipe.printRecipe();
        }
    }

    public ArrayList<Recipe> searchByName(String searchTerm) {

        ArrayList<Recipe> searchedRecipes = new ArrayList<>();

        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(searchTerm)) {
                searchedRecipes.add(recipe);
            }
        }
        return searchedRecipes;
    }

    public ArrayList<Recipe> searchByCookingTime(int maxCookingTime) {
        ArrayList<Recipe> searchedRecipes = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                searchedRecipes.add(recipe);
            }
        }
        return searchedRecipes;
    }

    public ArrayList<Recipe> searchByIngredient(String ingredient) {
        ArrayList<Recipe> searchedRecipes = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.containtsIngredient(ingredient)) {
                searchedRecipes.add(recipe);
            }
        }
        return searchedRecipes;
    }

}
