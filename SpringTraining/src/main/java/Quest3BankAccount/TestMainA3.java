package Quest3BankAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainA3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BankAccountRepoImp repoImp = (BankAccountRepoImp) context.getBean("BankAccRepo");
        //Controller will be automatically wired to the ban accounts
        BankAccountController b1 = (BankAccountController) context.getBean("BankAccController1");
        BankAccountController b2 = (BankAccountController) context.getBean("BankAccController2");
        b1.Account.SetAccount(1001,"Customer1","Savings",20000);
        b2.Account.SetAccount(1002,"Customer2","Current",10000);


        //Adding accounts to the repository collection
        repoImp.AddToAccRepo(b1);
       repoImp.AddToAccRepo(b2);

        System.out.println(repoImp.getAccRepo());
        //getting balance of an account
        //using BankAccountController
        System.out.println("Current balance:" + b1.getBalance(1001));



        //depositing amount to an account
        System.out.println("new balance after depositing 20000 in b1: "+b1.deposit(1001,20000));

        //withdrawing amount from an account
        System.out.println("new balance after withdrawing 10000 in b1: "+b1.withdraw(1001,10000));

        //Fund transferring from account 1 to account 2
        b1.fundTransfer(1001,1002,5000,repoImp);
    }
}
