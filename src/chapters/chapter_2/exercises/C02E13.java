package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double savings = 100;
		double totalSavings = 0;
		double interest = 0.05 / 12;
		
		System.out.println("Enter how much you would like to save monthly : ");
		
		savings = input.nextDouble();
		
		
		
		totalSavings += ((totalSavings + savings) * interest) + savings;
		totalSavings += ((totalSavings + savings) * interest) + savings;
		totalSavings += ((totalSavings + savings) * interest) + savings;
		totalSavings += ((totalSavings + savings) * interest) + savings;
		totalSavings += ((totalSavings + savings) * interest) + savings;
		totalSavings += ((totalSavings + savings) * interest) + savings;
		
		System.out.println("Total savings in 6 moths: " + (int)(totalSavings* 100) / 100.0);
	}

}
