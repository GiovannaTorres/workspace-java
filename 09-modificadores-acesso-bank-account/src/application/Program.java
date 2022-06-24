package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// informar número da conta, nome do titular, depósito inicial (opcional)
		//uma vez aberta, o número da conta não pode nunca ser alterado
		//o nome do titular pode ser alterado
		//o saldo não pode ser alterado livremente, só muda por meio de depósitos e saques
		//cada saque tem uma taxa de $5,00 
		//conta pode ficar negativa
		//programa realiza o cadastro com a opção de saque inicial ou não
		//mostrar dados após cada operação
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int acntNum = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print("Is there an initial deposit? y/n  ");
		char x = sc.next().charAt(0);
		
		if(x == 'y') {
			
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(acntNum, holder, initialDeposit);
			
		} else {
			
			account = new Account(acntNum, holder);

		}
		
		System.out.print("\n" + account.toString() + "\n");
		
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		account.deposit(value);
		
		System.out.print("\n" + account.toString() + "\n");
		
		System.out.print("Enter a withdral value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		
		System.out.print("\n" + account.toString() + "\n");
		
		
		sc.close();
	}

}
