
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal) {
        boolean alreadyIn = false;
        for (String m : this.meals) {
            if (m.equals(meal)) {
                alreadyIn = true;
            }
        }
        if (alreadyIn == false) {
            this.meals.add(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }
}
