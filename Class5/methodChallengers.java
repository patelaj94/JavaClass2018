package Class5;

import java.util.Scanner;

public class methodChallengers {
	static Scanner userInput = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		// 1. Easy
		for(int i =0; i <=10; i++) {
			printHello();
		}
		
		// 2. Medium
		System.out.println("What is your players name?");
		String playerName = userInput.next();
		System.out.println("How many games played?");
		int numberOfGames = userInput.nextInt();
		double average = averagePoints(numberOfGames, playerName);
		System.out.println(playerName + " Had an average of: " + average + " points per game over a span of " + numberOfGames
				+ " games." );
	
	}

	// Write a method that prints out "Hello how are you" - Call this method 10 times from the main method using a loop
	public static void printHello() {
		System.out.println("Hello how are you");
	}
	
	
	// Write a method which takes user input of a basketball players points per game for 10 games and prints the average.
	// Also ask the user for the player's name
	public static double averagePoints(int numberOfGames, String playerName) {
		int totalPoints = 0;
		for(int i=0; i < numberOfGames; i++) {
			System.out.println("How many points for " + playerName + " in game: " + i);
			int points = userInput.nextInt();
			totalPoints += points;
		}
		return totalPoints/numberOfGames;
	}
	
}
