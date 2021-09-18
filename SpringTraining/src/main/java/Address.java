public class Address {
    String street,city,state,country;
    int zip;


    public Address(String street, String city, String state, String country, int zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
    public void display() throws NullPointerException{
        System.out.println("street:" + this.street+"\ncity: "+this.city+"\nstate: "+this.state+"\ncountry: "+
                this.country+"\nZipcode: "+this.zip);
    }

    public Address(String street, String city, String state, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
