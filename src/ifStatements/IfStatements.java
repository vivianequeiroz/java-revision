package ifStatements;

public class IfStatements {

	public static void main(String[] args) { 
		int temperature = 32;
		if (temperature > 30) {
			System.out.println("It's a hot day!");
			System.out.println("Drink plenty of water!");
		} 
		// If curly braces are not going to be used, it's a good practice to indent the elses statements at the same level of the if statement
		else if (temperature > 20) 
		  	System.out.println("It's a beautiful day!");
	  else 
	  		System.out.println("It'a cold day");
		
		
		//variables can only be declared into code blocks
		int income = 120_000;
		if (income > 100_000) {
			boolean hasHighIncome = true;
		}
		
		//and due to the local scope of the if statement block, to turn the variable  throughout the application, 
		//it is recommended to declare a variable out of block
		int income2 = 120_000;
		boolean hasHighIncome2; 
		if (income2 > 100_000)
			hasHighIncome2 = true;
		else
			hasHighIncome2 = false;
		
		
		//Improving the code;
		int income3 = 120_000;
		boolean hasHighIncome3 = (income3 > 100_000); 
		
	  	
	} 
	
	
}