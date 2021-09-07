
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String message = String.valueOf(scanner.nextLine());
            
            if (message.equals("")){
                break;
            }
            String[] pieces = message.split(" ");
            for (int i=0; i<pieces.length;i++){
                if (pieces[i].contains("av")){
                    System.out.println(pieces[i]);
                }
            }
        }

    }
}
