package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount: ");
		double investment = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double interest = input.nextDouble();
		System.out.println("Enter number of years: ");
		double years = input.nextDouble();

		interest /= 1200;
		years *= 12;

		double accumulatedValue = investment * Math.pow((1 + interest), years);

		System.out.println("Accumulated value is " + accumulatedValue);

		input.close();

	}

}
