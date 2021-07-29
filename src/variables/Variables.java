package variables;

import java.awt.Point;
import java.util.Date;

public class Variables {

	public static void main(String[] args) {
		//Primitive types are used to store simples data, such as numbers, characters and booleans
		byte age = 21; 
		//up to 127
		long viewsCount = 3_123_456_789L; 
		//up to 2Billion, needs the "L" at the end so Java can reconize it as a long not an integer
		//big numbers can be separated by underscores to facilitate reading
		float price = 9.99F;
		//double is too big to store this value so as it occurs with long, the F at the end indicates its a float number
		char letter = 'A';
		//single character are surrounded by single quotes
		boolean isEligible = true;
		
		//Reference types store complex objects
		Date now = new Date();
		// In contrast with the primitive types, the new operator is necessary to allocate memory, something that is made by the JRE with the primitive types
		// now variable is an instance of Date object
		now.getTime();
		// Dot operator show the member of Date object 
		System.out.println(now);
		
		
		
		//Memory management 
		// At primitive types the memory location values are completely independent of each other 
	    // the memory location is used to store the values
		byte x = 1;
		byte y = x;
		x = 2;
		System.out.println(y);
		
		// At reference types some memory is located to store the value, and this location has an address
		// then a separated part of the memory will be also located with the reference to that previously address
		// The variable point1 holds the address to the object Point(1, 2) in the memory
		Point point1 = new Point(1, 2);
		Point point2 = point1;
		// point2 and point1 are variables that references the addres of Point obj
		point1.x = 2;
		System.out.println(point2);
		
		
				//Constants
		
		//Use of 'F' to indicate this number is a float since by default Java compiler see it as a double
		float pi = 3.14F; 
	}

}
// 50:43 https://www.youtube.com/watch?v=eIrMbAQSU34