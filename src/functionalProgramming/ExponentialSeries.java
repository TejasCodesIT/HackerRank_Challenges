package functionalProgramming;

import java.util.Scanner;

// This is a Chatgpt code which i had copy...

public class ExponentialSeries {
    
    // Function to compute e^x using series expansion
    public static double computeExponential(double x, int terms) {
        double result = 1.0;  // The first term is 1
        double term = 1.0;    // To hold the value of each term in the series
        
        // Compute the sum of the series up to the specified number of terms
        for (int n = 1; n < terms; n++) {
            term *= x / n;    // Calculate next term in the series
            result += term;   // Add the term to the result
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        // Read the number of test cases
        
        
        int t = sc.nextInt();
      
    	   
           // Process each test case
           for (int i = 0; i < t; i++) {
               double x = sc.nextDouble();  // Read the value of x
               
               // Calculate e^x using the series expansion
               double expX = computeExponential(x, 20);
               
               // Print the result formatted to 4 decimal places
               System.out.printf("%.4f%n", expX);
      
       }
        
        sc.close();
    }
}
