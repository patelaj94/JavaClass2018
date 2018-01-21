package examples;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		int iterateUp = 0;
		for( ; iterateUp != count; iterateUp++ ) {
			System.out.println("Keep going until iterateUp is equal to 10! iterateUp = " + iterateUp);
		}
		//We can also do this:
		for( int alsoUp = 5; alsoUp != count; alsoUp++ ) {
			System.out.println("Keep going until alsoUp is equal to 10! iterateUp = " + alsoUp);
		}
	}

}
