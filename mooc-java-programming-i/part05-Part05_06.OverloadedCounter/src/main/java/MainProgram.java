
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(5);
        System.out.println(counter.value());
        counter.increase(10);
        System.out.println(counter.value());

        counter.decrease(4);
        System.out.println(counter.value());
    }
}
