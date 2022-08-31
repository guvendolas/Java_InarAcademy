package chapters.chapter_4.exercises;

import java.util.Scanner;

public class C04E13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String s = input.nextLine();
		
		if (s.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		
		char ch = Character.toUpperCase(s.charAt(0));
		if (ch > 'Z' || ch < 'A') {
			System.out.println(s + " is an invalid input");
			System.exit(1);
		}
		
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(s + " is a vowel");
			
		}else {
			
		System.out.println(s + " is a consonant");
		}
	}

}
