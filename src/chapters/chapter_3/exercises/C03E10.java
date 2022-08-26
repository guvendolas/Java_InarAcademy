package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		System.out.println("what is " + number1 + " + " + number2);
		int userAnswer = input.nextInt();

		if (number1 + number2 == userAnswer) {
			System.out.println("Correct :)");
		} else {
			System.out.println("Sorry, wrong answer :(");
			input.close();
		}

	}

}
