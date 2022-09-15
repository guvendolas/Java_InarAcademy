package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E42 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter commission amount:");
		double commissionSought = input.nextDouble();
		double sale = 0;
		double commission = 0;

		while (commission < commissionSought) {

			if (sale <= 5000) {
				commission = sale * 0.08;

			} else if (sale <= 10000) {
				commission = 5000 * .08 + (sale - 5000) * 0.1;

			} else {

				commission = 5000 * .08 + 5000 * 0.1 + (sale - 10000) * .12;
			}

			sale += 0.01;
		}
		System.out.printf("The sale you need to generate is %.2f", (sale - 0.01));
	}

}
