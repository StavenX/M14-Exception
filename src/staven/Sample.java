package staven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		boolean complete = false;
		
		// Do this piece of code, while bool 'complete' is not true
		while (!complete) {
			// Try code inside bracket
			try {
				System.out.println("Enter first num: ");
				double num1 = scanner.nextDouble();
				
				if (num1 == 123) {
					throw new Exception("Number is too simple!");
				}
				
				System.out.println("Enter second num: ");
				double num2 = scanner.nextDouble();
				
				double sum = num1/num2;
				System.out.println(sum);
				
				complete = true;
				scanner.close();
			}
			
			// Catch and handle an error (instead of shutting down)
			catch(ArithmeticException ae ) {
				System.out.println("You can't divide by zero! ");				
			}
			
			catch(InputMismatchException ime ) {
				System.out.println("Characters not accepted.");				
				scanner.next();
			}
			
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Number is not creative enough.");
			}
			
		}		
		
	}
	
}
