package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = input.nextLine();
		int numberOfUp = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				numberOfUp++;
			}
		}

		System.out.println("The number of uppercase letters is " + numberOfUp);
	}

}
