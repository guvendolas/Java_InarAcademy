package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double y2 = -x / 2 + 100;
		String s = " ";

		if (((y > 0) && (x > 0) && (x + 2 * y2 < 200))) {
			s = " ";
		} else {
			s = " not ";
		}

		System.out.print("The point is" + s + "in the triangle");

		input.close();
	}

}
