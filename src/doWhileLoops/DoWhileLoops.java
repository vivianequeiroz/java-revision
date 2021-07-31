package doWhileLoops;

public class DoWhileLoops {

	public static void main(String[] args) {
		
		//While loops are commonly preferred since do while loops are executed at leat one time, 
		// since the condition will be verified later 
		String input = "";
		
		do {
			System.out.print("Input: ");
			input = scanner.next().toLowerCase();
			System.out.println(input);
		} while (!input.equals("quit"));
	}

}
