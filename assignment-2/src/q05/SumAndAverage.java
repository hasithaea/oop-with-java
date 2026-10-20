package q05;

public class SumAndAverage {
    public static void main (String args[]) {
        int i = 0;
        double sum = 0;
        
        for (i=1; i<=100; i++) {
            sum+=i;
        }
        
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+ sum/100);
    }
}
