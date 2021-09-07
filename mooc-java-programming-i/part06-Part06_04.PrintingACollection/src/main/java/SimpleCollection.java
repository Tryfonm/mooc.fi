
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + name + " is empty.";

        } else {
            String e = " elements:";
            if (this.elements.size() == 1) {
                e = " element:";
            }
            String temp1 = "The collection " + name + " has " + this.elements.size() + e;
            String temp2 = "";
            for (String element : this.elements) {
                temp2 = temp2 + "\n" + element;
            }
            return temp1 + temp2;
        }
    }
}
