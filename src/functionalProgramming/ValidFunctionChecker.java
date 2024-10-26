package functionalProgramming;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValidFunctionChecker {

    // Method to check if the given pairs can represent a valid function
    public static String isValidFunction(int[][] pairs) {
        Set<Integer> xValues = new HashSet<>();

        for (int[] pair : pairs) {
            int x = pair[0];
            // Check for duplicate x values
            if (xValues.contains(x)) {
                return "NO"; // Found a duplicate x value
            }
            xValues.add(x);
        }

        return "YES"; // All x values are unique
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {
            System.out.print("Enter number of pairs: ");
            int n = Integer.parseInt(scanner.nextLine());
            int[][] pairs = new int[n][2];

            System.out.println("Enter the pairs:");
            for (int j = 0; j < n; j++) {
                String[] inputs = scanner.nextLine().split(" ");
                pairs[j][0] = Integer.parseInt(inputs[0]); // x value
                pairs[j][1] = Integer.parseInt(inputs[1]); // y value
            }

            String result = isValidFunction(pairs);
            System.out.println(result);
        }

        scanner.close();
    }
}

