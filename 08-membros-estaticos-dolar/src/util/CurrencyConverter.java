package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	//preço do dolar x quantidade a ser comprada x (ele mesmo + imposto)
	public static double converter (double dollarPrice, double amount) {
		return dollarPrice * amount * (1.00 + IOF);
	}
	
	

}
