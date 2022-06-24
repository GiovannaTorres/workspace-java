package estruturaRepetitiva;

import java.util.Scanner;

public class ex6for {

	public static void main(String[] args) {
		//Ler um número inteiro N e calcular todos os seus divisores.
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Calcular divisores de: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <=N; i++) {
			if(N%i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
