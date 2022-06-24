package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// Calculando a área de dois triângulos diferentes (x e y) e então imprimindo qual triângulo tem a maior área
		
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the value of the 3 sides of the triangle X: ");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		
		System.out.println("Enter the value of the 3 sides of the triangle Y: ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		double bigger = Math.max(areaY, areaX);
		
		System.out.printf("\nTriangle X area: %.2f", areaX);
		System.out.printf("\nTriangle Y area: %.2f", areaY);
		
		if(bigger == areaX) {
			System.out.println("Triangle X has a larger area");
		} else {
			System.out.println("\nTriangle Y has a larger area");
		}
	
		
		sc.close();

	}

}
