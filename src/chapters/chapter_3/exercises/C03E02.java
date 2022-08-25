package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E02 {

	public static void main(String[] args) {
		int a = (int) (System.currentTimeMillis() % 10);
		int b = (int) (System.currentTimeMillis() / 7 % 10);
		int c = (int) (System.currentTimeMillis() / 5 % 10);

		int correctAnswer = a + b + c;

		Scanner input = new Scanner(System.in);
		System.out.println("Fill in your answer an than press enter : " + a + " + " + b + " + " + c + " = ");

		int userAnswer = input.nextInt();

		if (userAnswer == correctAnswer) {
			System.out.println("That's correct");
		} else
			System.out.println("that is incorrect");
		input.close();

	}

}
