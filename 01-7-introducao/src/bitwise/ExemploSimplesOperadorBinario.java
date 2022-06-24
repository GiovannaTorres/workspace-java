package bitwise;

import java.util.Scanner;

public class ExemploSimplesOperadorBinario {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a = 89;
		int b = 60;
		
		System.out.print("a&b = ");
		System.out.println(a & b);
		
		System.out.print("a|b = ");
		System.out.println(a | b);
		
		System.out.print("a^b = ");
		System.out.println(a ^ b);
		
		System.out.print("89 em binário ");
		System.out.println(Integer.toBinaryString(a));
		
		System.out.print("60 em binário ");
		System.out.println(Integer.toBinaryString(b));
		
		System.out.print("24 em binário ");
		System.out.println(Integer.toBinaryString(a&b));
		
		sc.close();
	}
}
