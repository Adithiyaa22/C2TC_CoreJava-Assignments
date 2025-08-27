package com.Adithiyaa.userdefinedexception.bank;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Create BankAccount object
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, balance);

        try {
            // Deposit operation
            System.out.print("Enter amount to deposit: ");
            double depositAmt = sc.nextDouble();
            account.deposit(depositAmt);

            // Withdrawal operation
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmt = sc.nextDouble();
            account.withdraw(withdrawAmt);

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed. Thank you for banking with us!");
        }

        sc.close();
	}

}
