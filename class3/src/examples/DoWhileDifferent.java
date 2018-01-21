package examples;

public class DoWhileDifferent {

	public static void main(String[] args) {
		int doWhileCount = 1;
		int whileCount = 1;
		
		while (whileCount <1 ) {
			System.out.println("I'm in a while loop, but I should never be printed!");
		}
		
		do {
			System.out.println("I'm in a do-while loop, but I should never be printed!");
		} while (whileCount <1 );
	
	}

}
