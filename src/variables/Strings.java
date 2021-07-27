package variables;

public class Strings {

	public static void main(String[] args) {
		String message = "  Hello World" + "!!  ";
		// Strings are reference type, but since they are often used 
		// the short way of creating a String variable allows the shortcut by using String literal directly 
		message.endsWith("!!");
		// the dot operator gives access to numerous members of String class
		System.out.println(message.replace("!", "*"));
				// parameters are the holes defined in the methods
				// arguments are the actual values passed to the methods
		// replace does not modify the original String
		// in Java Strings are immutable
		System.out.println(message);
		System.out.println(message.trim());
		// remove unecessary blank spaces
		
		
	}

}
