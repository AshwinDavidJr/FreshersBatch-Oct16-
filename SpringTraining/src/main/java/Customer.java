public class Customer {
    int cid;
    String cName;
    int contact;
    Address cAddress;

    public Customer(int cid, String cName, int contact) {
        this.cid = cid;
        this.cName = cName;
        this.contact = contact;

    }

    public void setcAddress(Address cAddress) {
        this.cAddress = cAddress;
    }

    public void display(){
        System.out.println("ID:" + this.cid+"\nname: "+this.cName+"\ncontact: "+this.contact+"\naddress:");
        this.cAddress.display();
    }
}
