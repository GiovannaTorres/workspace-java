package bitwise;

import java.util.Scanner;

public class MascaraBinario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//a máscara precisa ser representada por 1 somente na posição que queremos descobrir e 0 nas demais
		// o java ignora zeros à esquerda em binário
		// 0b indica que são bits
		//o int nesse caso é 32 ou seja 0000010 0000
		int mask = 0b100000;
		
		System.out.print("Digite um número inteiro e descobriremos se o sexto bit é 1 ou 0: ");
		int n = sc.nextInt();
		
		if((n&mask) != 0) {
			System.out.println("O sexto bit é 1!");
		}
		else {
			System.out.println("O sexto bit é 0!");
		}
		
		sc.close();

	}

}
