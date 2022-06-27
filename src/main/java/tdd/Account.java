package tdd;

public class Account {

    private int balance;
    private  int number;
    private  String name;
    private String pin;

    public Account(int number, String name, String pin) {
        this.number = number;
        this.name = name;
        this.pin =pin;

    }


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(int amount,String pin) {
        if (amount < 0) {
            balance = balance;
        } else
        if (amount > balance) {
            balance = balance;
        } else
        if (amount < balance) {
            balance = balance - amount;
        } else
            if(this.pin.equals(pin)){
                balance = balance - amount;
            }


    }
}
