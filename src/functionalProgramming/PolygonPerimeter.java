package functionalProgramming;
import java.util.Scanner;

public class PolygonPerimeter {
    
 
    public static double calculateDistance(int[] point1, int[] point2) {
        return Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
    }

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

  
        double perimeter = 0.0;

        for (int i = 0; i < n; i++) {
            int[] currentPoint = points[i];
            int[] nextPoint = points[(i + 1) % n]; 
            perimeter += calculateDistance(currentPoint, nextPoint);
        }

       
        System.out.printf("The perimeter of the polygon is: %.2f%n", perimeter);
        
        scanner.close();
    }
}

