package breakContinue;

import java.util.Scanner;

public class BreakContinue {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (true) {
			System.out.println("Input: ");
			input = scanner.next().toLowerCase(); 
			if (input.equals("pass"))
				//moves control to the beginning of a loop
				continue;
			if (input.equals("quit"))
				//terminates a loop
				break;
			System.out.println(input);
		}
	
	}
}
