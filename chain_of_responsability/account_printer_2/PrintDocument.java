public class PrintDocument {
    
    public void print(DocumentExtension documentExtension, Account account) {
        AccountPrinter ac3 = new AccountPrinterPORCENTO();
        AccountPrinter ac2 = new AccountPrinterCSV(ac3);
        AccountPrinter ac1 = new AccountPrinterXML(ac2);

        ac1.print(documentExtension, account);

    }
    
}
