public class PrintDocument {
    
    public void print(DocumentExtension documentExtension, Account account) {
        AccountPrinter ac1 = new AccountPrinterXML();
        AccountPrinter ac2 = new AccountPrinterCSV();
        AccountPrinter ac3 = new AccountPrinterPORCENTO();
        AccountPrinter ac4 = new AccountPrinterBRANCOS();

        ac1.setNextAccountPrinter(ac2);
        ac2.setNextAccountPrinter(ac3);
        ac3.setNextAccountPrinter(ac4);

        ac1.print(documentExtension, account);

    }
    
}
