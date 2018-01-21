package examples;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameClass {

	public static void main(String[] args) {
		// Liang Java, page 161
				Random rand = new Random();
				Scanner input = new Scanner(System.in);
				int guessMe = rand.nextInt(10) + 1;
				
				boolean notRightYet = true;
				
				System.out.println("Guess the number from 1-10 I'm thinking of! ");
				int playerGuess = input.nextInt();
				while(notRightYet == true) {
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
