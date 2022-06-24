package estruturaSequencial;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String []args) {
		
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferença do produto	de A e B pelo produto de C e D 
		//segundo a fórmula: DIFERENCA = (A * B - C * D)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores inteiros:");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = (A*B)-(C*D);
		
		System.out.println("A diferença dos produtos é:" + diferenca);
		
		
		sc.close();
	}

}
