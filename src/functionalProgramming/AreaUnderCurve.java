package functionalProgramming;

import java.util.Scanner;

public class AreaUnderCurve {


    public static double evaluatePolynomial(double[] coeffs, double x) {
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }


    public static double trapezoidalRule(double[] coeffs, double a, double b, int n) {
        double h = (b - a) / n;
        double area = 0.5 * (evaluatePolynomial(coeffs, a) + evaluatePolynomial(coeffs, b));

        for (int i = 1; i < n; i++) {
            double x_i = a + i * h;
            area += evaluatePolynomial(coeffs, x_i);
        }

        area *= h;
        return area;
    }


    public static double volumeOfRevolution(double[] coeffs, double a, double b, int n) {
        double h = (b - a) / n;
        double volume = 0.0;

        for (int i = 0; i < n; i++) {
            double x_i = a + i * h;
            double x_next = a + (i + 1) * h;
            volume += (Math.PI * (Math.pow(evaluatePolynomial(coeffs, x_i), 2) + 
                                 Math.pow(evaluatePolynomial(coeffs, x_next), 2))) * (h / 2);
        }

        return volume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter polynomial coefficients (space-separated): ");
        String[] coeffStr = scanner.nextLine().split(" ");
        double[] coeffs = new double[coeffStr.length];

        for (int i = 0; i < coeffStr.length; i++) {
            coeffs[i] = Double.parseDouble(coeffStr[i]);
        }

      
        System.out.print("Enter number of intervals: ");
        int n = Integer.parseInt(scanner.nextLine());
 
        
        System.out.print("Enter lower limit (a): ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter upper limit (b): ");
        double b = Double.parseDouble(scanner.nextLine());

      
        double area = trapezoidalRule(coeffs, a, b, n);
        double volume = volumeOfRevolution(coeffs, a, b, n);

        
        System.out.printf("Area under the curve: %.5f%n", area);
        System.out.printf("Volume of revolution: %.5f%n", volume);
        
        scanner.close();
    }
}
