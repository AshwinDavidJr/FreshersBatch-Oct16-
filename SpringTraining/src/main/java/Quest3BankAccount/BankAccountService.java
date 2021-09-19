package Quest3BankAccount;

public interface BankAccountService {
    public double withdraw(long AccId,double Balance);
    public double deposit(long AccId,double Balance);
    public double getBalance(long AccId);

    public boolean fundTransfer(long FromAcc,long ToAcc,double amount, BankAccountRepoImp Account);



}
