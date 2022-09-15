package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E48 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = input.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if ((i + 1) % 2 == 1) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
