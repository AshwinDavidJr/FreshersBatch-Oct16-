package Quest3BankAccount;

public class BankAccServiceImp  implements BankAccountService{

    @Override
    public double withdraw(long AccId, double Balance) {
        return 0;
    }

    @Override
    public double deposit(long AccId, double Balance) {
        return 0;
    }

    @Override
    public double getBalance(long AccId) {
        return 0;
    }

    @Override
    public boolean fundTransfer(long FromAcc, long ToAcc, double amount , BankAccountRepoImp Accounts) {
        return false;
    }
}
