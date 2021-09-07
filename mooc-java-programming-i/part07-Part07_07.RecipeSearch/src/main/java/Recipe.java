
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micha
 */
public class Recipe {

    private final String name;
    private final int cookingTime;
    private final ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime) {
        this.name = name;

        this.ingredients = new ArrayList<>();
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return this.name;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getListOfIngridients() {
        return this.ingredients;
    }

    public boolean containtsIngredient(String searchedIngredient) {
        boolean isFound = false;
        for (String ingredient : this.ingredients) {
            // System.out.println("Currently comparing:" + ingredient + " and " + searchedIngredient);
            if (ingredient.equals(searchedIngredient)) {
                isFound = true;
            }
        }
        return isFound;
    }

    public void printRecipe() {
        System.out.println(this.name + ", cooking time: " + this.cookingTime);
    }

    public void addIgredient(String igredient) {
        this.ingredients.add(igredient);
    }
}
