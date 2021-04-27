public class Application {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(1000.0);
        System.out.println("Account balance = " + account.getBalance());
        account.deposit(1000.0);
        System.out.println("Account balance = " + account.getBalance());
        account.withDraw(1500.0);
        System.out.println("Account balance = " + account.getBalance());
        account.withDraw(500.0);
        System.out.println("Account balance = " + account.getBalance());
        account.withDraw(500.0);
        System.out.println("Account balance = " + account.getBalance());

        System.gc(); // Calling garbage collector
    }
}
