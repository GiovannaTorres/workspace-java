package estruturaRepetitiva;

import java.util.Scanner;

public class ex1while {

	public static void main(String[] args) {
		/* Escreva um programa que repita a leitura de uma senha at? que ela seja v?lida. Para cada leitura de senha 
		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta ? o valor 2002*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a senha: ");
		int password = sc.nextInt();
		
		while(password != 2002) {
			System.out.println("Senha inv?lida. Tente novamente.");
			password = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
