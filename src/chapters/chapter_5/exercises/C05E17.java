package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number from 1 to 15: ");
		int max = input.nextInt();
		int spaces = max;

		for (int i = 1; i <= max; i++) {
			String nums = "";
			int digit = i;

			for (int s = spaces; s > 0; s--) {
				nums += "   ";
			}
			spaces--;
			while (digit >= 1) {
				nums += (digit > 9) ? digit + " " : digit + "  ";
				digit--;
			}

			digit += 2;

			while (digit <= i) {
				nums += digit + "  ";
				digit++;
			}
			System.out.println(nums);
		}
	}
}
