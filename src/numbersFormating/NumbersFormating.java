package numbersFormating;

import java.text.NumberFormat;

public class NumbersFormating {

	public static void main(String[] args) {
		// Abstract class can't be instantiated 
		// NumberFormat currency = new NumberFormat();
		
		//factoring methods
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String result = currency.format(13165498.897);
		System.out.println(result);
		
		
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		String result2 = percent.format(0.897);
		System.out.println(result2);
		
		
		//Methods chain
		
		String resultChain = NumberFormat.getPercentInstance().format(0.25);
		System.out.println(resultChain);
	}

}
