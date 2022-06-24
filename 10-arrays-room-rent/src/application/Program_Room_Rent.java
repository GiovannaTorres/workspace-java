package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program_Room_Rent {

	public static void main(String[] args) {
		// 10 quartos para alugar, identificados de 0 a 9
		// programa inicia 10 quartos vazios
		// lê uma quantidade n que representa o número de estudantes que vão alugar
		// registra o aluguel de n estudantes informando nome, email e quarto escolhido de 1 a 10
		// suponhamos que o quarto escolhido esteja sempre vago
		// imprime relatório de todas as ocupações do pensionato por ordem de quarto

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rents = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("\nRent#" + (i+1));
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rents[(room-1)] = new Rent(name, email, room);
		}
		
		System.out.println("\n\nBusy rooms:");
		
		
		for(int i=0; i<rents.length; i++) {
			if(rents[i] != null) {
				System.out.println(rents[i].toString());
			}
		}
		
		sc.close();
		
	}

}
