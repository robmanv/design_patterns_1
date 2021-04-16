public interface AccountPrinter {
    void print(DocumentExtension documentExtension, Account account);
    void setNextAccountPrinter(AccountPrinter accountPrinter);
    
}
