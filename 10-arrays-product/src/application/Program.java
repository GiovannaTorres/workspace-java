package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter vector size: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++){
			System.out.print("Product " + i + " name: ");
			String name = sc.next();			
			System.out.print("Product " + i + " price: ");
			double price = sc.nextDouble();

			vect[i] = new Product(name, price);
			sum += price;
		}
		
		double avg = sum/vect.length;
		
		System.out.printf("\nAverage price: %.2f", avg);
		
		sc.close();
	}

}
