package input;

import java.util.Scanner;

public class Inputtest {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner (System.in);
		
		System.out.println("Enter Name: ");
		String name = inputScanner.nextLine();
        System.out.println("Hello " + name);
        
        System.out.println("Enter your age: ");
        int age = inputScanner.nextInt();
        
        if (age > 120) {
        	System.out.println("Fake news");
        	System.exit(0);
        } else if (age < 5) {
        	System.out.println("You must be older!");
        	System.exit(0);
        
        } else {
        System.out.println("So your age is: " + age);
        }
        
        System.out.println("Enter your weight: ");
        double weight = inputScanner.nextDouble();
        if (weight > 150) {
        	System.out.println("You must be a murcian");
        	System.exit(0);
        } else if (weight < 30) {
        	System.out.println("Go buy a pineapple pizza");
        	System.exit(0);
        	
        }
        System.out.println("So your weight is: " + weight);
	}

}
