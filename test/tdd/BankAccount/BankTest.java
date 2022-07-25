package tdd.BankAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {
    Bank myBank;
    @BeforeEach
    void setMyBank(){
        myBank = new Bank("AccessBank","Yaba,Sabo");
    }
    @Test
    void testThatBankCanRegisterCustomer(){

    }
}
