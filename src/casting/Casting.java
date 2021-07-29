package casting;

import java.util.Iterator;

public class Casting {

	public static void main(String[] args) {
		//Implicit casting - occurs when the variable has enough space to store the other variables value
		// byte > short > int > long > float > double
		// automatic casting only occurs with compatible types
		// 1 byte
		short x = 1;
		// 4 bytes
		int y = x + 2;
		
		double a = 1.1;
		double b = x + 2;
		
		double c = 1.1;
		int d = (int)c + 2;
		
		String e = "1";
		Integer.parseInt(e); // Wrapper class to convert string into a number
		
		
	}
}
