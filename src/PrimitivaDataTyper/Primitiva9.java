package PrimitivaDataTyper;

import java.util.Scanner;



public class Primitiva9 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		
		Scanner inputScanner = new Scanner (System.in);
	
		System.out.println("Enter first binary number");
		
		String x = inputScanner.nextLine();
		
		System.out.println("Enter second binary number");
		
		String z = inputScanner.nextLine();
		
		 int k = x * z;
		
		System.out.println("The sum is: " + k);
		
		System.exit(0);
	}

}
