package arrays;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// Since its a reference type, the new operator + array type are necessary
		// It's a good practice to name the variable in plural
		int[] numbers = new int[5];
		
		numbers[0] = 5;
		// This will print the memory address of numbers array 
		System.out.println(numbers);
		// toString => method overloading, it has several implementations with different parameters data type
		// it will return the Array values
		System.out.println(Arrays.toString(numbers));
		
		
		// Newer method to initialize an array with values:
		int[] numbers2 = { 1, 2, 3, 4, 5 };
		System.out.println(numbers.length);
		// Arrays have a fixed length that once values are inserted in cannot be modified or excluded
		// To have a dynamically group of items Java Collection Classes can be used
		
		// Arrays sorted
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers)); 

		//Multidimensional array
		int [][] numbers3 = new int[2][3];
		// row x column
		numbers3[0][0] = 1; 
		// deepToString must be used with this type of array in order to display its values
		System.out.println(Arrays.deepToString(numbers3));
	}

}
