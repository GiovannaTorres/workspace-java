package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double balance;

	// construtor - ao invés de passar o valor direto pro atributo balance, o método deposit() faz isso. 
	// nesse caso, se a regra de negócio do depósito mudasse, o
	// construtor ainda assim estaria atualizado
	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}

	// sobrecarga
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	// getters
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

	// setters - não vamos fazer de accountNumber pq não pode ser modificada
	// e não vamos fazer de balance pq ele só altera com os métodos de depositar e
	// retirar
	public void setHolder(String holder) {
		this.holder = holder;
	}

	// toString
	public String toString() {
		return "Account: " + accountNumber + ", Holder: " + holder + String.format(", Balance: $ %.2f", balance);
	}

	// métodos

	public double withdraw(double qnt) {
		return balance -= (qnt + 5.00);
	}

	public double deposit(double qnt) {
		return balance += qnt;
	}

}
