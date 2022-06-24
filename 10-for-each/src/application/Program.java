package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"strawberry", "cherry", "dragonfruit", "lemon"};

		System.out.println("______For______");
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		
		System.out.println("\n______For each______");
		for(String fruit : vect) {
			System.out.println(fruit);
		}
	}

}
