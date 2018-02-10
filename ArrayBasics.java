import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		// Initialize an array
		double[] sampleArray = new double[5];
		
		// Adding data to the array
		sampleArray[0] = 30.0;
		sampleArray[1] = 35.0;
		sampleArray[2] = 40.0;
		sampleArray[3] = 45.0;
		sampleArray[4] = 50.0;
		
		

		System.out.println(sampleArray[1]);
		System.out.println(sampleArray.length);
		
		//System.out.println(sampleArray[5]);
		//sampleArray[5] = 60.0;
		
		
		//System.out.println(sampleArray[5]);
	
	
		// Array Initializer - Java shorthand notation for initializing arrays
		double[] duplicateSampleArray = {30.0, 35.0, 40.0, 45.0, 50.0};
		System.out.println(Arrays.toString(duplicateSampleArray));
		System.out.println(duplicateSampleArray);

	}

}
