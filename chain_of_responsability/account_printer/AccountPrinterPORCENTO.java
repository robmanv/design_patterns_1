public class AccountPrinterPORCENTO implements AccountPrinter {
    
    private AccountPrinter nextAccountPrinter;

    public AccountPrinterPORCENTO() {
    }

    public AccountPrinterPORCENTO(AccountPrinter nextAccountPrinter) {
        this.nextAccountPrinter = nextAccountPrinter;
    }

    public void setNextAccountPrinter(AccountPrinter nextAccountPrinter) {
        this.nextAccountPrinter = nextAccountPrinter;
    }

    public void print(DocumentExtension documentExtension, Account account) {
        if (documentExtension == DocumentExtension.PORCENTO) {
            System.out.println("imprime PORCENTO");
        } else {
            nextAccountPrinter.print(documentExtension, account);
        }

    }


}
