public class NegativeStatus implements EstadoDaConta {

    @Override
    public void withDraw(Double value, Account account) {
        throw new RuntimeException("Saldo NEGATIVO!");
    }

    @Override
    public void deposit(Double value, Account account) {
        account.setBalance(account.getBalance() + (value * 0.95));
        atualizaStatus(account);
    }

    public void atualizaStatus(Account account) {
        if (account.getBalance() > 0) {
            account.estadoDaConta = new PositiveStatus();
        } else {
            if (account.getBalance() < 0) {
                account.estadoDaConta = new NegativeStatus();
            } else {
                account.estadoDaConta = new NeutralStatus();
            }
        }
    }


}
