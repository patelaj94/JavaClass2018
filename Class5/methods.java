package Class5;

public class methods
{
    public static void main(final String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; ++i) {
            sum += i;
        }
        System.out.println(sum);
        
        int sum2 = 0;
        for (int j = 20; j <= 27; ++j) {
            sum2 += j;
        }
        System.out.println(sum2);
        
        int sum3 = 0;
        for (int k = 35; k <= 45; ++k) {
            sum3 += k;
        }
        System.out.println(sum3);
        
        sumValues(1, 10);
        sumValues(20, 27);
        sumValues(35, 45);
    }
    
    public static int sumValues(final int value1, final int value2) {
        int sum = 0;
        for (int i = value1; i <= value2; ++i) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }
}
