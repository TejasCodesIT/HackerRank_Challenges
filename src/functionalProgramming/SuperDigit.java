package functionalProgramming;
import java.util.Scanner;

public class SuperDigit {

 
    public static int superDigit(int n) {
   
        if (n < 10) {
            return n;
        }
        

        int digitSum = 0;
        while (n > 0) {
            digitSum += n % 10; 
            n /= 10;           
        }
        
       
        return superDigit(digitSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.print("Enter the number n: ");
        String nStr = scanner.nextLine();
        
        System.out.print("Enter the number k: ");
        int k = Integer.parseInt(scanner.nextLine());

        int digitSum = 0;
        for (char ch : nStr.toCharArray()) {
            digitSum += ch - '0'; 
        }

      
        int initialValue = digitSum * k;

       
        int result = superDigit(initialValue);
        System.out.println("The super digit is: " + result);
        
        scanner.close();
    }
}
