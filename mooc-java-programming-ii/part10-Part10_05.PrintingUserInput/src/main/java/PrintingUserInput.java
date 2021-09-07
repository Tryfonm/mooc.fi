
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputLog = new ArrayList<>();
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            inputLog.add(input);
        }
        inputLog.stream()
                .forEach(number ->System.out.println(number));
    }
}
