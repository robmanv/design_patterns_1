public class Account {
    private Double balance;
    protected EstadoDaConta estadoDaConta;

    public Account() {
        this.estadoDaConta = new NeutralStatus();
        balance = 0.0;
    }

    public void withDraw(Double value) {
        estadoDaConta.withDraw(value, this);
    }

    public void deposit(Double value) {
        estadoDaConta.deposit(value, this);
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
