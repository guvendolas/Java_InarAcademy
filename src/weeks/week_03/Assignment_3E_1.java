package weeks.week_03;

import java.util.Scanner;

public class Assignment_3E_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your service year");
		int year = input.nextInt();
		System.out.println("Enter your salary");
		int salary = input.nextInt();

		if (year > 5) {
			double bonus = salary * 0.05;
			System.out.println("Your bonus amount is " + bonus);
		} else {
			System.out.println("You bonus amount is 0");
		}
		input.close();
	}

}
