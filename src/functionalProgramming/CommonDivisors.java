package functionalProgramming;
import java.util.Scanner;

public class CommonDivisors {

  
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++; 
                if (i != n / i) {
                    count++; 
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the number of test cases (T): ");
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            System.out.print("Enter M and L: ");
            int M = scanner.nextInt();
            int L = scanner.nextInt();
            
           
            int gcdValue = gcd(M, L);
            
          
            int divisorsCount = countDivisors(gcdValue);
            
   
            System.out.println("The number of common divisors of " + M + " and " + L + " is: " + divisorsCount);
        }
        
        scanner.close();
    }
}
