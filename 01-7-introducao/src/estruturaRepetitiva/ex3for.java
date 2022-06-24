package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ex3for {

	public static void main(String[] args) {
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor1 = 0.0;
		double valor2 = 0.0;
		double valor3 = 0.0;
		
		double mediaPonderada = 0.0;
		
		System.out.println("Realizar quantos casos teste?: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("\nDigite 3 valores reais: ");
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			mediaPonderada = ((valor1*2)+(valor2*3)+(valor3*5))/10;;
			System.out.printf("\nMédia ponderada: %.2f", mediaPonderada);
			
		}
		
		sc.close();

	}

}
