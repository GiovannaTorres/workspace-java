package estruturaRepetitiva;

import java.util.Scanner;

public class ex2while {

	public static void main(String[] args) {
		/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)*/
		
		Scanner sc = new Scanner (System.in);
		
		
		String quadrante = "";
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		
		while(x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				quadrante = "primeiro";
			} 
			else if (y > 0 && x < 0){
				quadrante = "segundo";
			} 
			else if (y < 0 && x < 0) {
				quadrante = "terceiro";
			} 
			else if (x > 0 && y <0) {
				quadrante = "quarto";
			} 
			else {
				quadrante = "";
			}
			
			System.out.println(quadrante);
			
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		
		
		sc.close();

	}

}
