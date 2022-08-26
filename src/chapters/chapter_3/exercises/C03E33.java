package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight an price for package 1: ");

		double w1 = input.nextDouble();
		double p1 = input.nextDouble();

		System.out.println("Enter weight an price for package 2: ");

		double w2 = input.nextDouble();
		double p2 = input.nextDouble();

		double r = w1 / p1;
		double r2 = w2 / p2;

		if (r > r2) {
			System.out.println("Package 1 has a better price");

		} else if (r == r2) {
			System.out.println("Two package have to same price");
		} else {
			System.out.println("Package 2 has a beter price");
		}

		input.close();

	}

}
