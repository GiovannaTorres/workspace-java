package funcoesString;

public class FuncoesBasicasString {

	public static void main(String[] args) {
		
		String frase = "Nessa frase vamos demonstrar diferentes funções para tratar uma String em Java.         ";
		
		String lower = frase.toLowerCase();
		String upper = frase.toUpperCase();
		String trim = frase.trim();
		String substringApartirDe = frase.substring(12);
		String substringEntre = frase.substring(12, 32);
		String replaceChar = frase.replace("a", "x");
		String replaceString = frase.replace("frase", "sentença");
		int primeiroIndex = frase.indexOf("frase");
		int ultimoIndex = frase.lastIndexOf("i");
		
		
		System.out.println("Original: " + frase + "-\n");
		System.out.println("toLowerCase: " + lower + "-");
		System.out.println("toUpperCase: " + upper + "-");
		System.out.println("trim: " + trim + "-");
		System.out.println("substring: " + substringApartirDe + "-");
		System.out.println("substring: " + substringEntre + "-");
		System.out.println("replace: " + replaceChar + "-");
		System.out.println("replace: " + replaceString + "-");
		System.out.println("\nindexOf: " + primeiroIndex);
		System.out.println("lastIndexOf: " + ultimoIndex);
		
		
		
		String[] vect = frase.split(" ");
		String palavra1 = vect[0];
		String palavra2 = vect[1];
		String palavra3 = vect[2];
		String palavra4 = vect[3];
		String palavra5 = vect[4];
		
		System.out.println("\nsplit com vetor: ");
		System.out.println(palavra1);
		System.out.println(palavra2);
		System.out.println(palavra3);
		System.out.println(palavra4);
		System.out.println(palavra5);

	}

}
