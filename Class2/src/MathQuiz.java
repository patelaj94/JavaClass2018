import java.util.Random;
import java.util.Scanner;
/*
  * Math Quiz Exercise
	1. Generate two random numbers
	2. Ask the user the sum of two given integers
	3. Evaluate whether the answer is correct or wrong
	
	Use an if else statement
	Use “==“ to compare the user’s answer to the actual answer
 */

public class MathQuiz {

	public static void main(String[] args) {
		
		// Problem to relay concepts of if else, and using == operator: Page 96 in book
		Random rand = new Random();

		Scanner input = new Scanner(System.in);
		int number1 = rand.nextInt(10) + 1;
		int number2 = rand.nextInt(10) + 1;
		int trueAnswer = number1+number2;
		
		
		
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		int userAnswer = input.nextInt();
		if(trueAnswer == userAnswer){
			System.out.println("Correct!");
		}
		else{
			System.out.println("Sorry Wrong Answer");
		}
		input.close();
	}

}