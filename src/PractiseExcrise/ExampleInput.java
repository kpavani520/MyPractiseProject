package PractiseExcrise;

import java.util.Scanner;

public class ExampleInput {
	public static void main(String[] args) {
	    int x, y, sum;
	    Scanner myObj = new Scanner(System.in); // Create a Scanner object
	    System.out.println("Type a number:X=");
	    x = myObj.nextInt(); // Read user input
	   
	    System.out.println("Type another number:Y=");
	    y = myObj.nextInt(); // Read user input
	    

	    sum = x + y;  // Calculate the sum of x + y
	    System.out.println("Sum is: " + sum); // Print the sum
	  }

}
