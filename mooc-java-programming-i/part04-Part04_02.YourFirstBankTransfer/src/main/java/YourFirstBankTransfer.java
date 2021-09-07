
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        // Do not touch the code in Account.java
        // Write your program here
        Account acc1 = new Account("Matthews account", 1000.0);
        Account acc2 = new Account("My account", 0.0);

        acc1.withdrawal(100.0);
        acc2.deposit(100.0);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
