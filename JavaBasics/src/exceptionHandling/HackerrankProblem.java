package exceptionHandling;
import java.util.Scanner;
public class HackerrankProblem {

}
class MyCalculator {
	long result = 1;
public long power(int n, int p)  {
       for(int i=0; i<n; i++) {
        result = result * p;
    }
    return result;
}
public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
}