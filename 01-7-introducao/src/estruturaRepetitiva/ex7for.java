package estruturaRepetitiva;

import java.util.Scanner;

public class ex7for {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo.*/
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Número inteiro positivo: ");
		int N = sc.nextInt();
		
		double quadrado = 0;
		double cubo = 0;
		
		for(int i=1; i<=N; i++) {
			System.out.print(i);
			
			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i, 3);
			
			System.out.printf(" %.0f %.0f \n", quadrado, cubo);
		}
		
		sc.close();
	}

}
