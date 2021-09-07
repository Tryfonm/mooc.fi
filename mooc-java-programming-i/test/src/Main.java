import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Person p1 = new Person("Tryfon", 30);
        Person p2 = new Person("Johnys", 28);

        ArrayList<Person> ppl = new ArrayList<>();
        ppl.add(p1);
        ppl.add(p2);

//        Comparator<Person> comparator = Comparator.
//                comparing(Person::getAge);

        ppl.stream().forEach(person -> System.out.println(person));

        ppl.stream().sorted().forEach(person -> System.out.println(person));


    }
}
