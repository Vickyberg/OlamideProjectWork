package tdd.BankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer myCustomer;
    @BeforeEach
    void setUp(){
        myCustomer = new Customer("Ola","Dayo","M","wrgwwef@gmail.com","Juno Africa,Akoka","2442","rgerg453");
    }

}
