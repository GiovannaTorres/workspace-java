package estruturaCondicional;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("�MPAR");
		}
		
		sc.close();

	}

}
