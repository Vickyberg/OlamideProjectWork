package tdd.BankAccount;

import org.junit.jupiter.api.BeforeEach;

public class BankTest {
    Bank myBank;
    @BeforeEach
    void setMyBank(){
        myBank = new Bank("AccessBank","Yaba,Sabo");
    }
}
