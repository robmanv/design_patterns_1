public class AccountPrinterCSV implements AccountPrinter {

    private AccountPrinter nextAccountPrinter;

    public AccountPrinterCSV() {

    }
    public AccountPrinterCSV(AccountPrinter nextAccountPrinter) {
        this.nextAccountPrinter = nextAccountPrinter;
    }

    public void setNextAccountPrinter(AccountPrinter nextAccountPrinter) {
        this.nextAccountPrinter = nextAccountPrinter;
    }

    public void print(DocumentExtension documentExtension, Account account) {
        if (documentExtension == DocumentExtension.CSV) {
            System.out.printf("%s;%.2f", account.getName(), account.getBalance());
            System.out.println();
        } else {
            if (nextAccountPrinter != null) {
                nextAccountPrinter.print(documentExtension, account);
            } else {
                throw new RuntimeException("Formato de resposta invalido");
            }
        }

    }


}
