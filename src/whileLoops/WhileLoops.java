package whileLoops;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
		//while loops are recommended when we don't know exactly how many times
		//the operation will be repeated
		//Example: if it is asked for the user insert values until they type "quit"
		int i = 0;
		while (i > 0) {
			System.out.println("Hello World " + i);
			i--;
		}
		
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		//Since input is a reference type (String) it's not possible to use comparison operators since they're
		//going to compare the address of the string object
		//So even if you have to string with the same name, its not possible to compare with == because they will be stored in different address
		while (input.equals("quit")) {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		}
	}

}
