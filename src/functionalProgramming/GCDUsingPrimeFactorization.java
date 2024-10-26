package functionalProgramming;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GCDUsingPrimeFactorization {


    public static Map<Integer, Integer> primeFactorization(int n) {
        Map<Integer, Integer> factors = new HashMap<>();
    
        while (n % 2 == 0) {
            factors.put(2, factors.getOrDefault(2, 0) + 1);
            n /= 2;
        }


        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }


        if (n > 2) {
            factors.put(n, 1);
        }

        return factors;
    }

    public static int gcd(int a, int b) {
        Map<Integer, Integer> factorsA = primeFactorization(a);
        Map<Integer, Integer> factorsB = primeFactorization(b);
        
        int gcd = 1;

        for (int prime : factorsA.keySet()) {
            if (factorsB.containsKey(prime)) {

                gcd *= Math.pow(prime, Math.min(factorsA.get(prime), factorsB.get(prime)));
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the first positive integer (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second positive integer (b): ");
        int b = scanner.nextInt();
        

        int result = gcd(a, b);
        System.out.println("The greatest common divisor (gcd) of " + a + " and " + b + " is: " + result);
        
        scanner.close();
    }
}
