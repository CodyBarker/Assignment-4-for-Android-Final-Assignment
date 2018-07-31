package com.codymichaelbarker.hw4;

/**
 * Created by CodyO on 4/14/2018.
 */

public class BankAccount {
    String name;
    double balance;

    BankAccount(String accName, double accBalance)
    {
        name = accName;
        balance = accBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
