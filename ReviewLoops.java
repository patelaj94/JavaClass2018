import java.util.Random;
import java.util.Scanner;

public class ReviewLoops {

	public static void main(String[] args) {
		
		
		// How many times will the println be executed? *tip: Use debugger/break points
		for(int i=0; i < 5; i++) {
			for(int j=0; j < i; j++) {
				System.out.println("Hello");
			}
		}
		
	
		
		// review guessing game from last week
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int guessMe = 8;
		
		boolean notRightYet = true;
		
		System.out.println("Guess the number from 1-10 I'm thinking of! ");
		while(notRightYet == true) {
			
			int playerGuess = input.nextInt();
			if(playerGuess == guessMe) {
				System.out.println("Good job, you guessed it");
				notRightYet = false;
			}
			else if(playerGuess < guessMe){
				System.out.println("guess higher!");
			}
			else {
				System.out.println("Guess lower!");
			}
		}


	}

}
