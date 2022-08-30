package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a three digit number for the lottery:");
		int guess = input.nextInt();
		int lottery = (int) (Math.random() * 900) + 100;

		int lotteryTenDigits = lottery / 100;
		int LotteryOneDigits = lottery % 100;

		int guessTenDigits = guess / 100;
		int guessOneDigits = guess % 100;

		System.out.println("Lottery number " + lottery);

		if (lottery == guess) {
			System.out.println("Cong! You win 10.000$");

		} else if (LotteryOneDigits == guessTenDigits && lotteryTenDigits == guessOneDigits) {
			System.out.println("Cong! You win 3000$");
		} else if (LotteryOneDigits == guessOneDigits || lotteryTenDigits == guessTenDigits) {
			System.out.println("Cong! You win 1000$");
		} else {
			System.out.println("You lost");
		}

		input.close();

	}

}
