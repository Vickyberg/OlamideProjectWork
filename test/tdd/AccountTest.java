package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void accountCanBeCreatedTest() {
//given i have created an account
        Account account = new Account();
        //when i check my balance
        int balance = account.getBalance();
        //confirm the balance is zero
        assertEquals(0, balance);
    }

    @Test
    public void depositMoneyTest() {
        //given i have an account
        Account olaAccount = new Account();
        //when i deposit money
        olaAccount.deposit(1_500);
        //check that my balance as change
        assertEquals(1500, olaAccount.getBalance());


    }

    @Test
    public void depositTwiceTest() {
        Account uselessAccount = new Account();
        uselessAccount.deposit(1_500);
        uselessAccount.deposit(2000);
        assertEquals(3500, uselessAccount.getBalance());


    }

    @Test
    @DisplayName("Deposit negative amount should not change balance test")
    public void depositNegativeTest() {
        Account olaAccount = new Account();
        olaAccount.deposit(-1000);
        assertEquals(0, olaAccount.getBalance());


    }

    @Test
    public void withdrawTest() {
        Account olaAccount = new Account();
        olaAccount.deposit(3500);
        olaAccount.withdraw(2000);
        assertEquals(1500, olaAccount.getBalance());

    }

    @Test
    @DisplayName("withdraw negative amount should not change account")
    public void withdrawNegativeTest() {
        Account olaAccount = new Account();
        olaAccount.deposit(3500);
        olaAccount.withdraw(-1);
        assertEquals(3500, olaAccount.getBalance());
    }

    @Test
    @DisplayName("withdraw amount higher than balance should not affect account")
    public void withdrawHigherTest() {
        Account olaAccount = new Account();
        olaAccount.deposit(3500);
        olaAccount.withdraw(4000);
        assertEquals(3500, olaAccount.getBalance());
    }

}
