package estruturaSequencial;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
		//o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 
		//e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		
		int total1 = 0;
		int total2 = 0;
		double valor1 = 0.0;
		double valor2 = 0.0;
		
		System.out.println("número de peças 1:");
		total1 = sc.nextInt();
		System.out.println("valor unitário peça 1");
		valor1 = sc.nextDouble();
		
		System.out.println("número de peças 2:");
		total2 = sc.nextInt();
		System.out.println("valor unitário peça 2");
		valor2 = sc.nextDouble();
		
		double aPagar = ((double)total1*valor1)+((double)total2*valor2);
		
		System.out.printf("\nTotal a pagar R$ %.2f", aPagar);
		
		sc.close();

	}

}
