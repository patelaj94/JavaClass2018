package Class5;

public class overloadingMethods
{
    public static void main(final String[] args) {
    		int num1 = 5;
    		int num2 = 6; 
    		double num3 = 7.0;
    		double num4 = 8.0;
    		int num5 = 9;
    		double num6 = 10.0;
    		
    		System.out.println(max(num1, num2));
    		System.out.println(max(num3, num4));
    		System.out.println(max(num1, num3));
    		System.out.println(max(num1, num2, num5));
    	
    }
    
    public static double max(double num1, double num2) {
    	 	System.out.println(" You called me! - max(double num1, double num2)");
        double result;
        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }
    
    public static int max(int num1, int num2) {
    		System.out.println(" You called me! - max(int num1, int num2)");
    		int result;
        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }
    
    public static int max(int num1, int num2, int num3) {
    		System.out.println(" You called me! - max(int num1, int num2, int num3)");
    		int result;
        if (num1 > num2 && num1 > num3) {
            result = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            result = num2;
        }
        else {
            result = num3;
        }
        return result;
    }
}