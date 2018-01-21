package solution;

public class DivisibleLoop {
	
	public static void main(String[] args) {
		//First, let's try a while loop
		int count = 1;
		System.out.println("First with a while loop: ");
		while(count<=20) {
			if(count % 3 == 0) {
				System.out.println("The number " + count + " is divisble by 3!");
			}
			else {
				System.out.println(count + " is not divisible by 3!");
			}
			count++;
		}
		
		System.out.println("Now with a for loop:");
		//Now let's do the same with a for loop
		for (count = 1; count <= 20; count ++ ) {
			if(count % 3 == 0) {
				System.out.println("The number " + count + " is divisble by 3!");
			}
			else {
				System.out.println(count + " is not divisible by 3!");
			}
		}
	}
}
