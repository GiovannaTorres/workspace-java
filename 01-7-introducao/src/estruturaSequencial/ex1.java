package estruturaSequencial;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, e depois 
		//mostrar na tela a soma desses números com uma mensagem explicativa.
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.println("Digite o primeiro inteiro:");
		a = sc.nextInt();
		System.out.println("Digite o segundo inteiro:");
		b = sc.nextInt();
		
		System.out.printf("A soma de %d e %d é igual a %d", a, b, a+b);
		
		sc.close();
	}

}
