public class AccountPrinterXML implements AccountPrinter {
    
    private AccountPrinter nextAccountPrinter;

    public AccountPrinterXML() {

    }

    public AccountPrinterXML(AccountPrinter nextAccountPrinter) {
        this.nextAccountPrinter = nextAccountPrinter;
    }

    public void setNextAccountPrinter(AccountPrinter nextAccountPrinter) {
        this.nextAccountPrinter = nextAccountPrinter;
    }

    public void print(DocumentExtension documentExtension, Account account) {
        if (documentExtension == documentExtension.XML) {
            System.out.printf("<conta><titular>%s</titular><saldo>%.2f</saldo>", account.getName(), account.getBalance());
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
