import java.util.Scanner;
/*
 * Calculate Grade Exercise
	1. Use a char data type as the letter grade for a test score
	2. Take the users input number grade in the format of a double
	3. Based on the number grade, use a nested if else to print letter grade
	A = 90-100
	B=80-90
	C=70-80
	D=60-70
	F=60 or less
 */

public class CalculateGrade {

	public static void main(String[] args) {
		
		// Sample to demonstrate a nested for loop in Java.  Page 91
		Scanner input = new Scanner(System.in);
		char grade;
		System.out.println("Please enter your grade: ");
		double score = input.nextDouble();
		
		if(score >= 90.0)
			grade = 'A';
		else if(score >= 80.0)
			grade = 'B';
		else if(score >= 70.0)
			grade = 'C';
		else if(score >= 60.0)
			grade = 'D';
		else 
			grade = 'F';
		
		System.out.println("Your Grade: " + grade);
		
		input.close();
	}

}
