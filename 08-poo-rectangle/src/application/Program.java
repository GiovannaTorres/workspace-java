package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// programa que lê valores de largura e altura de um retangulo
		//mostra sua area, perimetro e diagonal
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle fig1 = new Rectangle();
		
		System.out.println("Set the rectangle base: ");
		fig1.base = sc.nextDouble();
		
		System.out.println("Set the rectangle height: ");
		fig1.height = sc.nextDouble();
		
		System.out.println(fig1.toString());

		
		
		sc.close();
	}

}
