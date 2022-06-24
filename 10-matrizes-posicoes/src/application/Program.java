package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// programa lê números M e N que representam respectivamente número de linhas e colunas da matriz
		//lê números que vão compor a matriz
		//lê número X
		// procura por X na matriz, imprime sua posição e números acima, abaixo e dos lados
		// todas as posicoes em que X ocorrer serão impressas
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Rows: ");
		int m = sc.nextInt();
		System.out.print("Columns: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		System.out.println("Enter whole numbers to compose the matrix: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("\n-----Matriz-----");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		System.out.println("Enter a number to get the position: ");
		int x = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				
				if(mat[i][j] == x) {
					System.out.println("\nPosition: " + i + "," + j);
					
					if(j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j<mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i>0) {
						System.out.println("Top: " + mat[i-1][1]);
					}
					if(i<mat[i].length-1)
					System.out.println("Bottom: " + mat[i+1][j]);
				}
			}
		}
		
		
		
		sc.close();
	}

}
