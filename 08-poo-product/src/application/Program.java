package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product tv = new Product();
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		tv.name =  sc.next();
		System.out.println("Price: $");
		tv.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		tv.quantity = sc.nextInt();
		
		
		System.out.println("Product data: " + tv.toString());
		
		System.out.println("Enter the quantity of products to be added in stock: ");
		int add = sc.nextInt();
		tv.addProducts(add);
		
		System.out.println("Updated data: " + tv.toString());
		
		System.out.println("Enter the quantity of products to be removed from stock: ");
		int remove = sc.nextInt();
		tv.removeProducts(remove);
		
		System.out.println("Updated data: " + tv.toString());
		
		System.out.println("--PROGRAM END--");
		sc.close();
	}

}
