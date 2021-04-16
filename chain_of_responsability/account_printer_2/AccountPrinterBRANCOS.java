public class AccountPrinterBRANCOS implements AccountPrinter {

    private AccountPrinter nextAccountPrinter;

    public AccountPrinterBRANCOS() {
    }

    public void setNextAccountPrinter(AccountPrinter nextAccountPrinter) {
        this.nextAccountPrinter = nextAccountPrinter;
    }

    public void print(DocumentExtension documentExtension, Account account) {
        System.out.println("imprime BRANCOS");

    }


}
