package Quest3BankAccount;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BankAccountController implements BankAccountService {
   BankAccount Account;

    @Override
    public double withdraw(long AccId, double Amount) {
        if (this.Account.getAccId()==AccId){
            this.Account.setAccBalance(Account.getAccBalance()-Amount);
            return Account.getAccBalance();
        }
        return 0;
    }

    @Override
    public double deposit(long AccId, double Amount) {
        if (this.Account.getAccId()==AccId){
            this.Account.setAccBalance(Account.getAccBalance()+Amount);
            return Account.getAccBalance();
        }
        return 0;
    }

    @Override
    public double getBalance(long AccId) {
        if (this.Account.getAccId()==AccId)
            return this.Account.getAccBalance();
        return 0;
    }

    @Override
    public boolean fundTransfer(long FromAcc, long ToAcc, double amount,BankAccountRepoImp Accounts) {

        /*for (BankAccountController b:Accounts.getAccRepo()
             ) {
            if (b.Account.getAccId()==FromAcc)
                if (b.)

        }*/
        return false;
    }

    public void setAccounts(BankAccount accounts) {
        Account = accounts;
    }
}
