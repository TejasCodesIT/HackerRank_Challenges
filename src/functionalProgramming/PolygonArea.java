package functionalProgramming;
import java.util.Scanner;

public class PolygonArea {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of points: ");
        int n = Integer.parseInt(scanner.nextLine());
        
       
        int[][] points = new int[n][2];

    
        System.out.println("Enter the points (x y):");
        for (int i = 0; i < n; i++) {
            String[] inputs = scanner.nextLine().split(" ");
            points[i][0] = Integer.parseInt(inputs[0]); 
            points[i][1] = Integer.parseInt(inputs[1]); 
        }

       
        double area = 0.0;

        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += points[i][0] * points[j][1];
            area -= points[i][1] * points[j][0];
        }

        area = Math.abs(area) / 2.0;

      
        System.out.printf("The area of the polygon is: %.2f%n", area);
        
        scanner.close();
    }
}
