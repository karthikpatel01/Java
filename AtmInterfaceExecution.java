package com.bankapplication;

import java.util.Scanner;

public class AtmInterfaceExecution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====== Welcome to Simple ATM ======");
		System.out.println("Enter customer name:");
		String name = scanner.nextLine();
		System.out.println("Enter customer address:");
		String address = scanner.
		nextLine();
		System.out.println("Enter customer phone number:");
		long phoneNumber = scanner.nextLong();
		System.out.println("Enter initial deposit amount: ₹");
		double initialDeposit = scanner.nextDouble();

		AtmInterface1 account = new AtmInterface1(name, address, phoneNumber, initialDeposit);

		int option;
		do {
			System.out.println("\nSelect an ATM option from below:");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your option [1-4]: ");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.print("\nEnter withdrawal amount: ₹");
				double withdrawAmount = scanner.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 2:
				System.out.print("Enter deposit amount: ₹");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 3:
				account.showBalance();
				break;
			case 4:
				System.out.println("👋 Thank you for using the ATM. Goodbye!");
				break;
			default:
				System.out.println("❌ Invalid option. Please choose between 1-4.");
			}
		} while (option != 4);

		scanner.close();
	}
}
