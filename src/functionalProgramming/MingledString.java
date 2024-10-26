package functionalProgramming;
import java.util.Scanner;

public class MingledString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter Pawel's favorite string: ");
        String a = scanner.nextLine();
        
        System.out.print("Enter Shaka's favorite string: ");
        String b = scanner.nextLine();
        
     
        if (a.length() != b.length()) {
            System.out.println("Strings must be of the same length.");
            return;
        }

   
        StringBuilder mingledString = new StringBuilder();
        int length = a.length();

     
        for (int i = 0; i < length; i++) {
            mingledString.append(a.charAt(i)); 
            mingledString.append(b.charAt(i)); 
        }


        System.out.println("Mingled String: " + mingledString.toString());
        
        scanner.close();
    }
}
