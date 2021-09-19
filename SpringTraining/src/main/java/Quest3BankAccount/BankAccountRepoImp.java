package Quest3BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountRepoImp implements BankAccountRepository {
    private List<BankAccountController> AccRepo = new ArrayList<>();
    BankAccServiceImp bs = new BankAccServiceImp();


    public List<BankAccountController> getAccRepo() {
        return AccRepo;
    }

    public void AddToAccRepo(BankAccountController b) {

        AccRepo.add(b);
    }

    @Override
    public double getBalance(long AccId) {
        for (BankAccountController b:AccRepo
             ) {

            if (b.Account.getAccId()==AccId)
                return b.Account.getAccBalance();
        }
        return 0;
    }

    @Override
    public double updateBalance(long AccId, double newBalance) {
        return 0;
    }
}
