package PrimitivaDataTyper;

import java.util.Scanner;

public class Primitiva8 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner inputScanner = new Scanner (System.in);
	
		System.out.println("Enter first binary number");
		
		String first = inputScanner.nextLine();
		
		System.out.println("Enter second binary number");
		
		String second = inputScanner.nextLine();
		
		String sum = (first + second);
		
		System.out.println("The sum is: " + sum);
		
		System.exit(0);
		

		
	}

}
