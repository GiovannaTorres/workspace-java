package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// programa lê a cotação do dolar
		// lê valor em dolar a ser comprado
		// informa quantos reais a pessoa vai pagar 
		// valor + 6% de iof sobre o dolar
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		System.out.printf("\nAmount to be paid in reais: R$ %.2f", CurrencyConverter.converter(dollarPrice, amount));
		
		sc.close();

	}

}
