package weeks.week_03;

import java.util.Scanner;

public class Assignment_3E_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the four-digit number: ");
		int number = input.nextInt();

		int d4 = number / 1000;
		int left = number % 1000;
		int d3 = left / 100;
		left = left % 100;
		int d2 = left / 10;
		int d1 = left % 10;

		System.out.println("reverse number is " + d1 + d2 + d3 + d4);

	}

}
