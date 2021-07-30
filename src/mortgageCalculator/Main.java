package mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final byte MONTHS_OF_YEAR = 12;
		final byte PERCENT =  100;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal: ");
		int principalValue = scanner.nextInt();
		
		
		System.out.print("Annual interest rate: ");
		float annualInterest = scanner.nextFloat();
		float monthlyInterest = annualInterest / PERCENT / MONTHS_OF_YEAR;
		
		System.out.println("Period (years): ");
		byte years = scanner.nextByte();
		int numberOfPayments = years * MONTHS_OF_YEAR;
		
		double mortgage = principalValue 
						  * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
						  / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);
		
	}
}
