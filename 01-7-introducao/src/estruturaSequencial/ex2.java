package estruturaSequencial;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea 
		//deste c�rculo com quatro casas decimais.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo:");
		double raio = sc.nextDouble();
		
		double area = 3.14159*(Math.pow(raio,2));
		
		System.out.printf("\n A area do circulo eh %.4f", area);
		
		
		sc.close();

	}

}
