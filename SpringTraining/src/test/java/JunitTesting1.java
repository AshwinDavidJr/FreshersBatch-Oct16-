import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTesting1 {


    @org.junit.jupiter.api.Test
    void display() {
        Address add = new Address("stree1","city1","state1","country1",987654);
        add.display();

    }
    @Test
    void testdisplay(){
        Address add = new Address("stree1","city1","state1","country1",987654);
        Customer c = new Customer(1001,"name1", 19283783);
        c.cAddress=add;
        c.display();
    }
}