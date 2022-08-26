package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter guess, 0 for heads or 1 for tails:");

		int guess = input.nextInt();
		int x = (int) (Math.random() * 2);

		if (x == guess) {
			System.out.println("Correct :)");
		} else {
			System.out.println("Sorry, Wrong :(");

		}
		input.close();
	}

}
