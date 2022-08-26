package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit integer");

		int useNum = input.nextInt();

		int lastNum = useNum % 10;
		int firstNum = useNum / 100;

		if (lastNum == firstNum) {
			System.out.println("Your number is palindrome");
		} else {
			System.out.println("Your number is not palindrome");

			input.close();
		}
	}

}
