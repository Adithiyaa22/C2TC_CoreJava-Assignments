package com.Adithiyaa.assignment05;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // First line: CSV input for ticket booking
        String[] bookingDetails = sc.nextLine().split(",");
        TicketBooking tb = new TicketBooking(
                bookingDetails[0],
                bookingDetails[1],
                Integer.parseInt(bookingDetails[2])
        );

        // Read payment mode
        int paymentMode = sc.nextInt();
        sc.nextLine(); // consume newline

        tb.printDetails();

        switch (paymentMode) {
            case 1: // Cash
                double cashAmount = sc.nextDouble();
                tb.makePayment(cashAmount);
                break;

            case 2: // Wallet
                double walletAmount = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                tb.makePayment(walletAmount, walletNumber);
                break;

            case 3: // Credit card
                String holderName = sc.nextLine();
                double cardAmount = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                tb.makePayment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();

	}

}
