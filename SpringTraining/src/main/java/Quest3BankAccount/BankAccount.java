package Quest3BankAccount;

public class BankAccount {
    long AccId;
    private String AccName;
    private String AccType;
    private double AccBalance;


    public void setAccId(long accId) {
        AccId = accId;
    }

    public void setAccName(String accName) {
        AccName = accName;
    }

    public void setAccType(String accType) {
        AccType = accType;
    }

    public void setAccBalance(double accBalance) {
        AccBalance = accBalance;
    }

    public void SetAccount(long aid, String Aname, String Atype, double balance){
        this.AccId=aid;
        this.AccName=Aname;
        this.AccType=Atype;
        this.AccBalance=balance;

    }
    public long getAccId() {
        return AccId;
    }
    public String getAccName() {
        return AccName;
    }
    public String getAccType() {
        return AccType;
    }
    public double getAccBalance() {
        return AccBalance;
    }


    public String toString()
    {
        return ("AccID:"+this.AccId+"\nAccName: "+this.AccName +"\n AccType: "+this.AccType+"\nAccBalance: "+this
                .AccBalance);
    }
}
