package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice verse: ");

		double op = input.nextDouble();

		if (op == 0) {
			System.out.println("Enter exchange rate for dollar: ");
			double rate = input.nextDouble();
			System.out.println("Enter the dollar amount: ");
			double amount = input.nextDouble();
			double result = rate * amount;
			System.out.println(amount + "dollar is " + result);
		} else if (op == 1) {
			System.out.println("Enter exchange rate for RMB: ");
			double rate2 = input.nextDouble();
			System.out.println("Enter RMB amount: ");
			double amount2 = input.nextDouble();
			double result2 = rate2 * amount2;
			System.out.println(amount2 + "RMB is " + result2);

		} else {
			System.out.println("Wrong digit!");
		}

		input.close();

	}

}
