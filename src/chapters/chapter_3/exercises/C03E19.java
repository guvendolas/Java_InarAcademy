package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sides of a triangle separated by spaces:");

		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		if (s3 > (s1 + s2) || s2 > (s1 + s2) || s1 > (s2 + s3)) {
			System.out.println("Invaldid");
		} else {
			System.out.println("Perimeter");
		}

		input.close();
	}

}
