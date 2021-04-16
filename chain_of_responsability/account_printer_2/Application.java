public class Application {
    public static void main(String[] args) {
        Account account = new Account("Maria", 2500.0);
        PrintDocument printDocument = new PrintDocument();

        printDocument.print(DocumentExtension.XML, account);
        printDocument.print(DocumentExtension.CSV, account);
        printDocument.print(DocumentExtension.PORCENTO, account);
        //printDocument.print(null, account);
    }
    
}
