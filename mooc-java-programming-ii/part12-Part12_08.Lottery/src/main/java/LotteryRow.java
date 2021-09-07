
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random rand;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.rand = new Random();
        this.randomizeNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {

        // Initialize the list for numbers
        this.numbers = new ArrayList<>();

        int c = 0;
        while (c < 7) {
            int candidateNumber = this.rand.nextInt(40) + 1;
            if (!(containsNumber(candidateNumber))) {
                this.numbers.add(candidateNumber);
                c++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}
