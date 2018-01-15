import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
		// Take 5 inputs from the user and print the sum
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i < 5; i++) {
			System.out.println("Enter a number ");
			sum = sum + input.nextInt();
		}
		System.out.println(sum);
	}

}
