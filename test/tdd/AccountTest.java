package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void accountCanBeCreatedTest() {
//given I have created an account
        Account account = new Account(1,"Olamide","1123");
        //when i check my balance
        int balance = account.getBalance();
        //confirm the balance is zero
        assertEquals(0, balance);
    }

    @Test
    public void depositMoneyTest() {
        //given i have an account
        Account account = new Account(1,"Olamide","1123");
        //when i deposit money
        account.deposit(1_500);
        //check that my balance as change
        assertEquals(1500, account.getBalance());


    }

    @Test
    public void depositTwiceTest() {
        Account account = new Account(1,"Olamide","1123");
        account.deposit(1_500);
        account.deposit(2000);
        assertEquals(3500, account.getBalance());


    }

    @Test
    @DisplayName("Deposit negative amount should not change balance test")
    public void depositNegativeTest() {
        Account account = new Account(1,"Olamide","1124");
        account.deposit(-1000);
        assertEquals(0, account.getBalance());


    }
    // todo addition of pin to withdraw

    @Test
    public void withdrawTest() {
        Account account = new Account(1,"Olamide","1123");
        account.deposit(3500);
        account.withdraw(2000,"1234");
        assertEquals(1500, account.getBalance());

    }

    @Test
    @DisplayName("withdraw negative amount should not change account")
    public void withdrawNegativeTest() {
        Account account = new Account(1,"Olamide","1123");
        account.deposit(3500);
        account.withdraw(-1,"1234");
        assertEquals(3500, account.getBalance());
    }

    @Test
    @DisplayName("withdraw amount higher than balance should not affect account")
    public void withdrawHigherTest() {
        Account account = new Account(1,"Olamide","1123");
        account.deposit(3500);
        account.withdraw(4000,"1233");
        assertEquals(3500, account.getBalance());
    }

}
