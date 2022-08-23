package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double v0;
		double v1;
		double t;

		System.out.println("Enter v0, v1, and t: ");

		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();

		double a = (v1 - v0) / t;

		System.out.println("The average acceleration is " + (int) (a * 1000) / 1000.0);

		input.close();

	}

}
