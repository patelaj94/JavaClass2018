package Class4;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
	
		int[] userArray = new int[5];
		// Create an array of size 5 by taking a user input
		for(int i=0; i<userArray.length; i++) {
			System.out.println("Please enter a value for array index " + i);
			userArray[i] = userInput.nextInt();
			System.out.println(Arrays.toString(userArray));
		}
		
		
		
		// sum all the elements in userArray
		int sum = 0;
		for(int i=0; i<userArray.length; i++) {
			
			sum = sum+userArray[i];
		}
		System.out.println("Sum of Array is " + sum);
		
		
		
		// Find the max value in the array
		int maxValue = userArray[0];
		for(int i=0; i<userArray.length; i++) {
			if(userArray[i] > maxValue) {
				maxValue = userArray[i];
			}
		}
		System.out.println("The Max value in your array is " + maxValue);
	}
}
