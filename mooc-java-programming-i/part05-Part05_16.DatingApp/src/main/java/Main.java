
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate d = new SimpleDate(11, 12, 1992);
        System.out.println(d);
        d.advance(15);
        System.out.println(d);
        d.afterNumberOfDays(15);
    }
}
