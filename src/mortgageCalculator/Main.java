package mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final byte MONTHS_OF_YEAR = 12;
		final byte PERCENT =  100;
		
		int principalValue = 0;
		float monthlyInterest = 0;
		int numberOfPayments = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) { 
			System.out.print("Principal: ");
			principalValue = scanner.nextInt();
			if (principalValue >= 1000 && principalValue <= 1_000_000) 
				break;
			System.out.println("Enter a value between 1000 and 1000000");
		}
		
		while(true) {
			System.out.print("Annual interest rate: ");
			float annualInterest = scanner.nextFloat();
			if (annualInterest >= 1 && annualInterest <= 30) {
				monthlyInterest = annualInterest / PERCENT / MONTHS_OF_YEAR;
				break;
			}
			System.out.println("Enter a value between 1 and 30");
		}
		
		while(true) {
			System.out.println("Period (years): ");
			byte years = scanner.nextByte();
			if (years >= 1 && years <= 30) { 
				numberOfPayments = years * MONTHS_OF_YEAR;
				break;
			}
			System.out.println("Enter a value between 1 and 30");
		}

		
		double mortgage = principalValue 
						  * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
						  / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage: " + mortgageFormatted);
		
	}
}
