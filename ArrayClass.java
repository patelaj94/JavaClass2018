import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// Page 253 in Liang Book - The Arrays Class
		double[] numbers = {6.3, 4.2, 1.4, 8.5, 9.0, 5.5, 11.0, 10.2};
		
		// Binary Search allows us to find the index of the specified value
		System.out.println("8.5's index in our array is index: " + Arrays.binarySearch(numbers, 8.5));
		
		
		// Sort the array
		//java.util.Arrays
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		
		System.out.println("8.5's index in our array is index: " + Arrays.binarySearch(numbers, 8.5));
		

		
		// 2-D arrays
		int[][] matrix = { { 1, 2, 3, 4 },
                			   { 5, 6, 7, 8 },
                			   { 9, 10, 11, 12 }
                			 };
		
		System.out.println(matrix[0][1]);
		System.out.println(matrix[1][2]);
		System.out.println(matrix[2][1]);
		
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);	
			}
		}
		
		
	}

}
