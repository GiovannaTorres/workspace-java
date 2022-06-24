package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
	 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name =  sc.next();
		System.out.println("Price: $");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("Product data: " + product.toString());
		
		System.out.println("Enter the quantity of products to be added in stock: ");
		int add = sc.nextInt();
		product.addProducts(add);
		
		System.out.println("Updated data: " + product.toString());
		
		System.out.println("Enter the quantity of products to be removed from stock: ");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		
		System.out.println("Updated data: " + product.toString());
		
		
		
		
		product.setName("PC");
		System.out.println("--Name updated:" + product.getName());
		
		System.out.println("\n--PROGRAM END--");
		sc.close();
	}

}

