package tdd.BankAccount;

import java.util.ArrayList;

public class Bank {

    private  String bankName;
    private String address;
    private ArrayList<Customer> customers;
    private  int count;

    public Bank(String bankName, String address) {

        this.bankName = bankName;
        this.address = address;
    }

    public void add(Customer newCustomer) {


        customers.add(newCustomer);


    }

    public int getCount() {
      return  customers.size();
    }
}
