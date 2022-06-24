package estruturaRepetitiva;

import java.util.Scanner;

public class ex1for {

	public static void main(String[] args) {
		/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
		 * inclusive o X, se for o caso*/
		
		Scanner sc = new Scanner(System.in);

		System.out.println("valor x (maior que 1 e menor que 1000: ");
		int x = sc.nextInt();
		
		while(x < 2 || x > 1000) {
			System.out.println("escolha um valor maior que 1 e menor que 1000: ");
			x = sc.nextInt();
		}
		
		for(int i = 1; i <= x; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
