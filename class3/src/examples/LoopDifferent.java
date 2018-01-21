package examples;

public class LoopDifferent {

	public static void main(String[] args) {
		int iterate = 1;
		int count = 10;
		System.out.println("First with a for loop: ");
		for(;iterate<=count;) {
			System.out.println("iterate is equal to : " + iterate);
			iterate++;
		}
		//This is the same as:
		iterate = 1;
		System.out.println("Now with a while loop: ");
		while (iterate <= count) {
			System.out.println("iterate is equal to : " + iterate);
			iterate++;
		}
		//And will do the same thing as
		iterate = 1;
		System.out.println("Now with a do-while loop: ");
		do {
			System.out.println("iterate is equal to : " + iterate);
			iterate++;
		} while (iterate <= count);
	}

}
