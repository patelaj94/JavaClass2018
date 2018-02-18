package Class5;
import java.util.Scanner;


public class definingMethods {
  
  public static void main(String[] args) {
	  
	  Scanner userInput = new Scanner(System.in);
	  
	  System.out.println("Enter your grade: ");
	  double userGrade = userInput.nextDouble();
	  printGrade(userGrade);
	  
	  System.out.println("Enter num1: ");
	  int num1 = userInput.nextInt();
	  System.out.println("Enter num2: ");
	  int num2 = userInput.nextInt();
	  int max = max(num1, num2);
	  System.out.println(max + " is the greater number between " + num1 + " and " + num2);
	  
	  userInput.close();
  }
  
  public static int max(int num1, int num2)
  {
    int result;
    if (num1 > num2) {
      result = num1;
    }
    else {
      result = num2;
    }
    
    return result;
  }
  
  public static void printGrade(double score)
  {
    char grade;
    if (score >= 90.0) {
    	  	grade = 'A'; 
    } 
    else if (score >= 80.0) {
        grade = 'B'; 
    } 
    else if (score >= 70.0) {
        grade = 'C'; 
    } 
    else if (score >= 60.0) {
    		grade = 'D';
    } 
    else {
        grade = 'F';
    } 
    System.out.println("Your Grade: " + grade);
  }
  
}