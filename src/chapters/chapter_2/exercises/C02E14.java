package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight in pound: ");
		double weightInpounds = input.nextDouble();
		
		System.out.println("Enter you height in inches: ");
		double heightInınches = input.nextDouble();
		
		double weighthInkilograms = weightInpounds * 0.45359237;
		double heightInmeters = heightInınches * 0.0254;
		double metersFactor = Math.pow(heightInmeters, 2);
		
		System.out.println("Your BMI is: " + weighthInkilograms / metersFactor);
		
		input.close();
	}

}
