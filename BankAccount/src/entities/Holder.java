package entities;

public class Holder {
	private String name;
	private int accountNumber;
	private double balance; 
	
	public Holder(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public Holder(String name, int accountNumber, double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		Deposit(initialDeposit);
	}
	
	//Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//Métodos
	public void Deposit(double amount) {
		balance += amount;
	}
	
	public void Withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber 
				+ ", "
				+ "Holder: "
				+ name
				+ ", "
				+ "Balance: $ "
				+ balance;
				
	}
}
