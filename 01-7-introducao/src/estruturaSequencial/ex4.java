package estruturaSequencial;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, 
		//o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
		//A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
		
		Scanner sc = new Scanner(System.in);
		
		int func = 0;
		double horas = 0.0;
		double valorHora = 0.0;
		double salario = 0.0;
		
		System.out.println("Digite o n�mero do funcion�rio: ");
		func = sc.nextInt();
		System.out.println("Agora as horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.println("O valor por hora: ");
		valorHora = sc.nextDouble();
		
		
		salario = horas*valorHora;
		
		System.out.printf("\n O sal�rio semanal do funcion�rio %d � R$ %.2f", func, salario);
		
		sc.close();

	}

}
