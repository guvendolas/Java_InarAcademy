package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly money: ");
		double money = input.nextDouble();
		System.out.println("Enter the interest rate: ");
		double rate = input.nextDouble();

		rate /= 12 * 100;

		System.out.println("Enter the months: ");
		double month = input.nextDouble();
		double savingMoney = 0;

		for (int i = 1; i <= month; i++) {
			savingMoney = (savingMoney + money) * (1 + rate);

		}
		System.out.println("Total saving is " + savingMoney);
	}

}
