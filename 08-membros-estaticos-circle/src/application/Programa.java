package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Programa {

	public static void main(String[] args) {
		// programa q lê um valor numerico qualquer para representar o raio de um círculo
		// daí mostra o quanto seria o valor de circunferencia e volume de uma esfera de acordo com o raio
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Radius: ");
		double radius = sc.nextDouble();
		
		System.out.printf("\nCircumference: %.2f",Calculator.circumference(radius));
		System.out.printf("\nVolume: %.2f",Calculator.volume(radius));
		System.out.printf("\nPI: %.2f",Calculator.PI);
		
		sc.close();

	}

}
