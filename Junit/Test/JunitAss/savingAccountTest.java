package JunitAss;

import org.junit.Test;

import static org.junit.Assert.*;

public class savingAccountTest {

    @Test
    public void withdraw() {
    }

    @Test
    public void deposit() {
    }

    @Test
    public void getBalance() {
    }

    @Test(expected = RuntimeException.class)
    public void test1(){                //testing insufficient balance
        savingAccount acc1 = new savingAccount();
        acc1.deposit(1000);
        acc1.withdraw(-100);  //testing for negative amount
    }
}