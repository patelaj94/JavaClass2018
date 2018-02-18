package Class5;

public class methodNuances{
    public static void main(final String[] args) {
    		
    	
    }
    
    public static double max(double num1, double num2) {
        double result;
        if (num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }
    
    public static void min(int num1, int num2) {
        int result;
        if (num1 < num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        System.out.println(result);
    }
    
}