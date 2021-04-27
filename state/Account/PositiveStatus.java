public class PositiveStatus implements EstadoDaConta {

    @Override
    public void withDraw(Double value, Account account) {
        if (account.getBalance() < -100000) {
            throw new RuntimeException("Limite INSUFICIENTE!");
        } else {
            account.setBalance(account.getBalance() - value);
            atualizaStatus(account);
        }
    }

    @Override
    public void deposit(Double value, Account account) {
        account.setBalance(account.getBalance() + (value * 0.98));
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
