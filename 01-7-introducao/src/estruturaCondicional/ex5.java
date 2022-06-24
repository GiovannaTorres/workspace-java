package estruturaCondicional;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e 
		//a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
		
		Scanner sc = new Scanner (System.in);
			
		
		double total = 0.0;
		String produto = "";
		
		System.out.println("Código do produto: ");
		int cod = sc.nextInt();
		System.out.println("Quantidade: ");
		int qtd = sc.nextInt();
		
		
		if (cod == 1) {
			total = qtd*4.0;
			produto = "cachorro-quente";
			
		} else if (cod == 2) {
			total = qtd*4.5;
			produto = "x-salada";
			
		} else if (cod == 3) {
			total = qtd*5.0;
			produto = "x-bacon";
			
		} else if (cod == 4) {
			total = qtd*2.0;
			produto = "torrada simples";
			
		} else if (cod == 5){
			total = qtd*1.5;
			produto = "refri";
			
		} else {
			System.out.println("Digite um código válido");
		}
		
		
		System.out.println("Item: " + produto);
		System.out.println("Quantidade: " + qtd);
		System.out.println("Total: R$" + total);
		
		
		sc.close();

	}

}
