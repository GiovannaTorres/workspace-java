package estruturaCondicional;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Número positivo");
		} else {
			System.out.println("Número negativo");
		}
		
		sc.close();

	}

}
