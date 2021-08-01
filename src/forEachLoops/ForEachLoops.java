package forEachLoops;

public class ForEachLoops {

	public static void main(String[] args) {
		// Used to iterate over arrays or collections 
		
		String[] fruits = { "Apple", "Grape", "Strawberry" };

		//the variable type of loops is the same of the array/collection
		//Limitations: an array can't be iterated from the end to the beginning 
					// the index of the variable created can't be accessible
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
