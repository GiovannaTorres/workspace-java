package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// informar n�mero da conta, nome do titular, dep�sito inicial (opcional)
		//uma vez aberta, o n�mero da conta n�o pode nunca ser alterado
		//o nome do titular pode ser alterado
		//o saldo n�o pode ser alterado livremente, s� muda por meio de dep�sitos e saques
		//cada saque tem uma taxa de $5,00 
		//conta pode ficar negativa
		//programa realiza o cadastro com a op��o de saque inicial ou n�o
		//mostrar dados ap�s cada opera��o
		
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
