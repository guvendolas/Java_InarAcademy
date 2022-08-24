package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x1;
		double x2;
		double y1;
		double y2;

		System.out.println("Enter x1 and y1: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();

		System.out.println("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		double exs = Math.pow((x2 - x1), 2);
		double eys = Math.pow((y2 - y1), 2);

		double a = Math.pow((exs + eys), 0.5);

		System.out.println("The distance the two points is " + a);

		input.close();
	}

}
