package functionalProgramming;
import java.util.Scanner;

public class UniquePowerSums {
    

    public static int countWays(int N, int power, int currentNum) {

        int currentPowerValue = (int) Math.pow(currentNum, power);
        

        if (N == 0) {
            return 1;
        }
        
 
        if (N < 0 || currentPowerValue > N) {
            return 0;
        }
        
       
        return countWays(N - currentPowerValue, power, currentNum + 1) + countWays(N, power, currentNum + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the integer N: ");
        int N = scanner.nextInt();
        
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        
  
        int result = countWays(N, power, 1);
        System.out.println("The number of ways to express " + N + " as the sum of unique natural numbers raised to the power of " + power + " is: " + result);
        
        scanner.close();
    }
}
