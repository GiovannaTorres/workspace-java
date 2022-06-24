package estruturaSequencial;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
		//o valor que recebe por hora e calcula o salário desse funcionário. 
		//A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		
		Scanner sc = new Scanner(System.in);
		
		int func = 0;
		double horas = 0.0;
		double valorHora = 0.0;
		double salario = 0.0;
		
		System.out.println("Digite o número do funcionário: ");
		func = sc.nextInt();
		System.out.println("Agora as horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.println("O valor por hora: ");
		valorHora = sc.nextDouble();
		
		
		salario = horas*valorHora;
		
		System.out.printf("\n O salário semanal do funcionário %d é R$ %.2f", func, salario);
		
		sc.close();

	}

}
