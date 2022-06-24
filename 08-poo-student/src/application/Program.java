package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		//programa que le o nome de um aluno e tres notas (primeiro vale 30 e segundo e terceiro valem 35 cada
		//mostra qual a nota final
		//mostra se passou ou não (pass ou failed)
		//se não passou, quantos pontos precisa pra obter o mínimo para ser aprovado (60% da nota)
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Name: ");
		student.name = sc.next();
		System.out.println("First semester grade: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Second semester grade: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Third semester grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println(student.toString());
		
		sc.close();
	}

}
