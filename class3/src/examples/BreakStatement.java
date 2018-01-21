package examples;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		
		System.out.println("I'll repeat what you say until you say 'stop'! I also don't want to say the word carrot!");
		while( true ) {
			String userAnswer = input.nextLine();
			if (userAnswer.equals("stop")) {
				System.out.println("Ok, we're done!");
				break;
			}
			else if (userAnswer.equals("carrot")) {
				System.out.println("I don't want repeat that!");
				continue;
			}
			else {
				System.out.println(userAnswer);
			}
		}
		
		input.close();
	}

}
