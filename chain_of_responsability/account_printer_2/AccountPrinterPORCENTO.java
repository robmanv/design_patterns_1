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
            if (nextAccountPrinter != null) {
                nextAccountPrinter.print(documentExtension, account);
            } else {
                throw new RuntimeException("Formato de resposta invalido");
            }
        }

    }


}
