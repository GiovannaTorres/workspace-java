package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ex4for {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("n: ");
		int n = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		for(int i=0; i<n; i++) {
			System.out.println("\na: ");
			a=sc.nextInt();
			System.out.println("b: ");
			b=sc.nextInt();
			
			
			if(b==0) {
				System.out.println("Divisão impossível");
			} else {
				double divisao = (double) a/b;
				System.out.printf("\n%d dividido por %d = %.2f", a, b, divisao);
			}
		}
		
		sc.close();
	}

}
