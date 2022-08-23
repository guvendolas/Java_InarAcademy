package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E10 {
	public static void main(String[] args) {

		double initialTemperature;
		double finalTemperature;
		double weightofwater;
		double result;

		System.out.println("Enter the weight of the water in kilograms: ");

		Scanner input = new Scanner(System.in);
		weightofwater = input.nextDouble();

		System.out.println("Enter the initial temperature of the water in celcius: ");

		Scanner input1 = new Scanner(System.in);
		initialTemperature = input1.nextDouble();

		System.out.println("Enter the final temperature of he water in celcius: ");

		Scanner input2 = new Scanner(System.in);
		finalTemperature = input2.nextDouble();

		result = weightofwater * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energy needed is " + result + " joules.");

		input.close();
		input1.close();
		input2.close();
	}

}
