package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Holder;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter to account holder name: ");
		sc.nextLine(); //quebra de linha
		String name = sc.nextLine();
		
		Holder holder;
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char option = sc.next().charAt(0);
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			holder = new Holder (name, accountNumber, initialDeposit); //construtor completo
		} else {
			holder = new Holder (name, accountNumber); //construtor sem deposito inicial
		}
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(holder);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		holder.Deposit(amount);
		
		System.out.println("Updated account data:");
		System.out.println(holder);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		amount = sc.nextDouble();
		holder.Withdraw(amount);
		
		System.out.println("Updated account data:");
		System.out.println(holder);
		
		sc.close();

	}

}
