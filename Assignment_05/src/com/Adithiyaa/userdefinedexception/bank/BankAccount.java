package com.Adithiyaa.userdefinedexception.bank;

public class BankAccount {
    private int accountNumber;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    // Withdrawal method
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        displayBalance();
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

}
