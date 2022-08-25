package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the today's day: ");

		int weekDay = input.nextInt();

		if (weekDay > 6 || weekDay < 0) {
			System.out.println("Incorrect value, please try again!");
		} else {
			System.out.println("Enter the number of days elapsed since today: ");
			int numDays = input.nextInt();

			int futureWeekDay = (weekDay + numDays) % 7;

			String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
			System.out.println(daysOfWeek[futureWeekDay]);

			input.close();
		}

	}

}
