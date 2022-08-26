package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of an ISBN as integer: ");

		int d1 = 0;
		int d2 = 1;
		int d3 = 3;
		int d4 = 6;
		int d5 = 0;
		int d6 = 1;
		int d7 = 2;
		int d8 = 6;
		int d9 = 7;
		int d10;

		System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9);

		d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (d10 < 11) {
			System.out.println("ISBN-10: " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8
					+ "" + d9 + d10);
		}

		else {

			System.out.println("ISBN-10: " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8
					+ "" + d9 + "X");

			input.close();

		}

	}

}
