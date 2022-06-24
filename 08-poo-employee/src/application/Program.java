package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// programa le dados de um funcionario (nome, salario bruto e imposto)
		//mostra os dados nome e salario liquido (menos imposto)
		//aumenta o salario com base em uma porcentagem baseada no salario bruto
		//mostra novamente o salario
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee one = new Employee();
		
		System.out.println("Set name: ");
		one.name =  sc.next();
		System.out.println("Set gross salary: ");
		one.grossSalary = sc.nextDouble();
		System.out.println("Set tax to subtract: ");
		one.tax = sc.nextDouble();
		
		System.out.println("\nEmployee data: " + one.toString());
		
		System.out.println("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		one.increaseSalary(percentage);
		
		System.out.println("\nEmployee updated data: " + one.toString());
		
		sc.close();

	}

}
