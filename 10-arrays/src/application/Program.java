package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.println("Size of the vector: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("\nPosition " + i + " :  ");
			vect[i]=sc.nextDouble();
			
			sum += vect[i];
		}
		
		System.out.println("\nAverage: " + (sum/n));
		
		
		
		
		sc.close();
	}

}
