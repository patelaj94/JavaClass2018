package examples;

public class DoWhile {

	public static void main(String[] args) {
		int count = 1;
		do {
			System.out.println("Hello world! I have said hello " + count + " times!");
			count++;
		} while (count < 11);
	}

}
