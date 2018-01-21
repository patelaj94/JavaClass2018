package examples;

public class NestedLoop {

	public static void main(String[] args) {
		System.out.println("outside of all loops");
		for (int i = 1; i<5; i++) {
			System.out.println("inside i loop here, i = " + i);
			
			for ( int j = 1; j<i; j++) {
				if(i % j == 0 && j != 1) {
					
				}

			}
		}

	}
}
