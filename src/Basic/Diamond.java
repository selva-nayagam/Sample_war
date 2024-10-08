package Basic;
import java.util.Scanner;
public class Diamond {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        scanner.close();

	        // Print the upper part of the diamond
	        for (int i = 1; i <= n; i++) {
	            // Print spaces before the numbers
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }

	            // Print numbers in increasing order
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }

	            // Print numbers in decreasing order (excluding the last number)
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        // Print the lower part of the diamond
	        for (int i = n - 1; i >= 1; i--) {
	            // Print spaces before the numbers
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }

	            // Print numbers in increasing order
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j + " ");
	            }

	            // Print numbers in decreasing order (excluding the last number)
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j + " ");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    
	}

}
