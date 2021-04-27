public interface EstadoDaConta {
    void withDraw(Double value, Account account);
    void deposit(Double value, Account account);

}
