package tdd.BankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerTest {

    Customer myCustomer;
    @BeforeEach
    void setUp(){
        myCustomer = new Customer("Ola","Dayo","M","wrgwwef@gmail.com","Juno Africa,Akoka","2442","rgerg453");
    }
    @Test
    void testWeHaveACustomer(){
        assertNotNull(myCustomer);
    }

    @Test
    void testWeCanGetCustomerFirstName(){
        assertEquals("Ola" ,myCustomer.getFirstName());
    }
    @Test
    void testWeCanGetCustomerLastName(){
        assertEquals("Dayo" ,myCustomer.getLastName());
    }


}
