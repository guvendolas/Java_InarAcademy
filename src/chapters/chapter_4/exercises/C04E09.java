package chapters.chapter_4.exercises;

import java.util.Scanner;

public class C04E09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character:");
		String s = input.nextLine();
		char a = s.charAt(0);

		System.out.println("The unicode for the character " + a + " is " + (int) a);
		input.close();
	}

}
