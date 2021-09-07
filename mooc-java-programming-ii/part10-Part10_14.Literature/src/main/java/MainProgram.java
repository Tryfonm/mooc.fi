
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation:");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, ageRecommendation));

        }

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getTitle);

        System.out.println(books.stream().count() + " books in total.\n");

        System.out.println("Books:");
        books.stream()
                .sorted(comparator)
                .forEach(book -> System.out.println(book.getTitle()
                + " (recommended for " + book.getAgeRecommendation() + " year-olds or older)"));
    }
}
