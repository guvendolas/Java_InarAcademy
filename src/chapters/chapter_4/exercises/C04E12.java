package chapters.chapter_4.exercises;

import java.util.Scanner;

public class C04E12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Ener a hex digit: ");
		String hexString = input.nextLine();

		if (hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}

		char ch = Character.toUpperCase(hexString.charAt(0));
		int value = 0;
		if (ch <= 'F' && ch >= 'A') {
			value = ch - 'A' + 10;
		} else if (Character.isDigit(ch)) {
			value = ch - '0';
		} else {
			System.out.println(ch + " is an invalid input");
			System.exit(0);
		}

		System.out.println("The decimal value for hex digit " + ch + " is " + Integer.toBinaryString(value));

		input.close();

	}

}
