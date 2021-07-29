package mathClass;

public class MathClass {
	
	public static void main(String[] args) {
		//Useful methods from Math class
		
		int resultRound = Math.round(1.1F);
		System.out.println(resultRound);
		
		// returns a value that is equal to or greater than the number
		// returns a double so a casting is necessary
		int resultCeil = (int)Math.ceil(1.1F);
		System.out.println(resultCeil);

		// returns the largest integer that is smaller or equal to the number
		int resultFloor = (int)Math.floor(1.1F);
		System.out.println(resultFloor);
		
		int resultMax = Math.max(1, 2);
		int resultMin = Math.min(1, 2);
		
		// returns a double
		double resultRandom = Math.random() * 10;
		int resultRandom2 = (int)(Math.random() * 10);
	}
}
