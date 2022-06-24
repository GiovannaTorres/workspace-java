package estruturaCondicional;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, 
		//sabendo que o mesmo pode come�ar em um dia e terminar em outro, 
		//tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("In�cio do jogo:");
		int inicio = sc.nextInt();
		System.out.println("Fim do jogo: ");
		int fim = sc.nextInt();
		
		int total = 0;
		
		if(inicio >= fim) {
			total = (24 - inicio) + fim;
		} else {
			total = (fim - inicio);
		} 
		
		if (total >= 1 && total <= 24) {
			System.out.println("Total: " + total);
		} else {
			System.out.println("O jogo tem dura��o m�nima de 1 hora e m�xima de 24 horas");
		}
		
		
		sc.close();

	}

}
