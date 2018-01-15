import java.util.Scanner;

public class IfElseConditionals {

	public static void main(String[] args) {
		
		// If statement: executes statement if the condition is true : Page 84
		
		int value1 = 12;
		int value2 = 8;
		/*
		if(value1 > 10) {
			System.out.println(value1 + " is greater than 10");
		}
		
		if(value2 > 10) {
			System.out.println(value2 + " is greater than 10");
		}
		*/
		
		// if-else statement is good when we have two conditions. One where the condition is met and another where it isn't : Page 89
		/*
		if(value2 > 10) {
			System.out.println(value2 + " is greater than 10");
		}
		else {
			System.out.println("Sorry " + value2 + " is not greater than 10");
		}
		
		*/
		// Take a user input and print whether the number is even or odd - hint use remainder/modulus
		
		Scanner input = new Scanner(System.in);
		
		int userInput;
		System.out.println("Please enter a number");
		userInput = input.nextInt();
		
		if(userInput % 2 == 0) {
			System.out.println(userInput + " Is an even number.");
		}
		else {
			System.out.println(userInput + " Is an odd number.");
		}
		input.close();
		
		
		
		// Math Quiz Exercise
		
		
	}
}
