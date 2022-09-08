package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int n1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = input.nextInt();

		int gcd = 0;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;

		}
		System.out.println("Greatest common denominator is " + gcd);
		input.close();
	}

}
