
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        if (num%2 == 0){
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is odd.");
        }
    }
}
