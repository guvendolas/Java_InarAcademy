package chapters.chapter_4.exercises;

import java.util.Scanner;

public class C04E08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code:");
		int userNumber = input.nextInt();

		char res = (char) userNumber;

		System.out.println("The unicode for the character " + res + " is " + userNumber);
		input.close();
	}

}
