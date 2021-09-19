package Quest3BankAccount;

public interface BankAccountRepository {
    public double getBalance(long AccId);
    public double updateBalance(long AccId, double newBalance);

}
