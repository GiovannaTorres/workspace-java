package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// programa l� um n�mero inteiro N e ent�o cria uma matriz com ordem nesse n�mero
		// lendo os n�meros inteiros que v�o compor a matriz
		// mostra a diagonal principal e n�meros negativos

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("\nMain diagonal: ");
		for(int i=0; i<matrix.length; i++) {
			System.out.print(matrix[i][i] + "  ");
		}
		
		int negativesCount = 0;
		
		System.out.print("\nNegative numbers: ");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j] < 0) {
					System.out.print(matrix[i][j] + " ");
					negativesCount++;
				}
			}
		}
		System.out.print("  Total of " + negativesCount);
		
		System.out.println("\n-----MATRIX------");
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		System.out.println();
		}
		
		
		sc.close();
	}

}
