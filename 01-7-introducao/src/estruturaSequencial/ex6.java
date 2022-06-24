package estruturaSequencial;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
		//Em seguida, calcule e	mostre: 
			//a) a área do triângulo retângulo que tem A por base e C por altura. 
			//b) a área do círculo de raio C. (pi = 3.14159) 
			//c) a área do trapézio que tem A e B por bases e C por altura. 
			//d) a área do quadrado que tem lado B. 
			//e) a área do retângulo que tem lados A e B

		Scanner sc = new Scanner(System.in);
		
		double A = 0.0;
		double B = 0.0;
		double C = 0.0;
		
		System.out.println("Digite 3 valores com ponto flutuante:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		// area = (base.altura) /2
		double trianguloRetangulo = (A*C)/2;
		
		//area = pi.(raio*raio)
		double circulo = 3.14159*(Math.pow(C, 2));
		
		//area = ((base+outrabase).altura)/2
		double trapezio = ((A+B)*C)/2;
		
		//area = lado*lado
		double quadrado = B*B;
		
		//area = base*altura
		double retangulo = A*B;
		
		
		System.out.printf("\n %.3f \n %.3f \n %.3f \n %.3f \n %.3f", trianguloRetangulo, circulo, trapezio, quadrado, retangulo);
	
		
		sc.close();
	}

}
