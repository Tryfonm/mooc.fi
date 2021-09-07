
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLength = 0;
        String nameMaxLength = " ";
        int sum = 0;
        int c = 0;

        while (true) {
            String row = String.valueOf(scanner.nextLine());
            if (row.equals("")) {
                break;
            }
            String[] pieces = row.split(",");
            int l = pieces[0].length();

            if (maxLength < l) {
                maxLength = l;
                nameMaxLength = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            c++;
        }
        double avg = (double) sum / c;
        System.out.println("Longest name: " + nameMaxLength);
        System.out.println("Average of the birth years: " + avg);
    }
}
