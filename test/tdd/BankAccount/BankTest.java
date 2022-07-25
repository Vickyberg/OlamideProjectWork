package tdd.BankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank myBank;
    @BeforeEach
    void setMyBank(){
        myBank = new Bank("AccessBank","Yaba,Sabo");
    }
    @Test
    void testThatBankCanRegisterCustomer(){
    Customer customer = new Customer("Ola","Dayo", "M",
            "olamide247@gmail.com","Juno Africa ,Akoka","244224","ola33");

    assertEquals(1,myBank.getCount());

    }
}
