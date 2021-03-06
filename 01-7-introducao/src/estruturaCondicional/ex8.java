package estruturaCondicional;

import java.util.Scanner;

public class ex8 {
	
	public static void main (String[] args) {
		/*Em um pa?s imagin?rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos,
	 	pois sabem que nele n?o existem pol?ticos corruptos e os recursos arrecadados s?o utilizados em 
	 	benef?cio da popula??o, sem qualquer desvio. A moeda deste pa?s ? o Rombus, cujo s?mbolo ? o R$.
		Leia um valor com duas casas decimais, equivalente ao sal?rio de uma pessoa de Lisarb. 
		Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, 
		segundo a tabela abaixo
		
		de 0.0 a 2000.0	ISENTO
		2000.01 a 3000.0  8%
		3000.01 a 4500.0  18%
		acima de 4500.0  28%
		
		Lembre que, se o sal?rio for R$ 3002.00, a taxa que incide ? de 8% apenas sobre R$ 1000.00, 
		pois a faixa de sal?rio que fica de R$ 0.00 at? R$ 2000.00 ? isenta de Imposto de Renda. 
		No exemplo fornecido (abaixo), a taxa ? de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, 
		o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o sal?rio para calcular o imposto sobre ele: ");
		double salario = sc.nextDouble();
		
		double imposto = 0.00;
		
		
		if (salario <= 2000.00) {
			imposto = 0.0;
			
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.00)*0.08;
			
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.00)*0.18 + (1000.00*0.8);
			
		} else if (salario > 4500.0) {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			
		} else {
			System.out.println("Valor inv?lido");
		}
		
		System.out.printf("\nTotal imposto: R$ %.2f", imposto);
		
		
		sc.close();
	}

}
