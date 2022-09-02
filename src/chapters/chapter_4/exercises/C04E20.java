package chapters.chapter_4.exercises;

import java.util.Scanner;

public class C04E20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Strings: ");
		String s = input.nextLine();

		System.out.println("The String length is " + s.length());
		System.out.println("The firs character is " + s.charAt(0));
		input.close();
	}

}
