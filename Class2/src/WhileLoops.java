import java.util.Random;
import java.util.Scanner;

public class WhileLoops {
	/*
	 * Repeat the addition Math Quiz - This time, prompt the user to keep guessing until they get the correct answer : Page 136
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int number1 = rand.nextInt(10) + 1;
		int number2 = rand.nextInt(10) + 1;
		int answer = number1+number2;
		
		System.out.println("What is " + number1 + " + " + number2 + " ?");
		
		while(answer != input.nextInt()) {
		System.out.println("Incorrect, Please Try Again.");
		}
		
		System.out.println("Correct");
		input.close();
		
		
	}

}
