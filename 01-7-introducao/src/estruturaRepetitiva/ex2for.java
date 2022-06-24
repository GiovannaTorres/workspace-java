package estruturaRepetitiva;

import java.util.Scanner;

public class ex2for {

	public static void main(String[] args) {
		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/
		
		Scanner sc = new Scanner(System.in);

		System.out.println("quantos números quer dar entrada: ");
		int n = sc.nextInt();
		
		int x = 0;
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("número: ");
			x = sc.nextInt();
			
			if(x > 9 && x < 21) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println("In[10,20] " + in);
		System.out.println("Out[10,20] " +out);
		
		sc.close();
	}

}
