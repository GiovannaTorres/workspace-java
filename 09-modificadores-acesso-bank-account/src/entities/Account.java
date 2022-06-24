package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double balance;

	// construtor - ao inv�s de passar o valor direto pro atributo balance, o m�todo deposit() faz isso. 
	// nesse caso, se a regra de neg�cio do dep�sito mudasse, o
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

	// setters - n�o vamos fazer de accountNumber pq n�o pode ser modificada
	// e n�o vamos fazer de balance pq ele s� altera com os m�todos de depositar e
	// retirar
	public void setHolder(String holder) {
		this.holder = holder;
	}

	// toString
	public String toString() {
		return "Account: " + accountNumber + ", Holder: " + holder + String.format(", Balance: $ %.2f", balance);
	}

	// m�todos

	public double withdraw(double qnt) {
		return balance -= (qnt + 5.00);
	}

	public double deposit(double qnt) {
		return balance += qnt;
	}

}
