package estruturaCondicional;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("N�mero positivo");
		} else {
			System.out.println("N�mero negativo");
		}
		
		sc.close();

	}

}
