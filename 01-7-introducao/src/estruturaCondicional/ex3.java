package estruturaCondicional;

import java.util.Scanner;

public class ex3 {
	
	public static void main (String[] args) {
		//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" 
		//ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. 
		//Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int B = sc.nextInt();
		
		if(A%B == 0 || B%A ==0) {
			System.out.println("M�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		
		sc.close();
	}

}
