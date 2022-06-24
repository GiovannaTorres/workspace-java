package bitwise;

import java.util.Scanner;

public class MascaraBinario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//a m�scara precisa ser representada por 1 somente na posi��o que queremos descobrir e 0 nas demais
		// o java ignora zeros � esquerda em bin�rio
		// 0b indica que s�o bits
		//o int nesse caso � 32 ou seja 0000010 0000
		int mask = 0b100000;
		
		System.out.print("Digite um n�mero inteiro e descobriremos se o sexto bit � 1 ou 0: ");
		int n = sc.nextInt();
		
		if((n&mask) != 0) {
			System.out.println("O sexto bit � 1!");
		}
		else {
			System.out.println("O sexto bit � 0!");
		}
		
		sc.close();

	}

}
