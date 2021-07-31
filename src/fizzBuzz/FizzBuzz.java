package fizzBuzz;

import java.util.Scanner;

// if divisible to 5, returns "fizz"
// if divisible to 3, returns "buzz"
// if divisible to 5 and 3, returns "fizzbuzz"
// if not divisible to 5 neither 3, returns the inserted 

public class FizzBuzz {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number: ");
		
		int numberInserted = scanner.nextInt();
		
		// since the program will stop by the moment it founds a true statement here, 
		// its recommended to put the most specific rules at the top so there will not  
		// occur cases where only "fizz" or "buzz" words will be displayed
		
		// even though theres a little bit of repetition since 'numberInserted % 5 == 0' appears more than once
		// this code has the benefit of being in a flat structure, 
		// without too much nested lines which would make it harder to read and understand 
		if (numberInserted % 3 == 0 && numberInserted % 5 == 0)
			System.out.println("fizzbuzz");
		else if (numberInserted % 5 == 0) 
			System.out.println("fizz");
		else if (numberInserted % 3 == 0)
			System.out.println("buzz");
		else
			System.out.println(numberInserted);

	}

}
