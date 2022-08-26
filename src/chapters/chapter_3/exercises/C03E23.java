package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double x1 = 0;
		double y1 = 0;

		double rectangleWidth = 10;
		double rectangleHeight = 5;

		String result = "";
		if (x2 <= 10.0 / 2 && y2 <= 5.0 / 2) {
			result += ("is in the rectangle");
		} else {
			result += "is not in the rectangle";
		}

		System.out.println("point(" + x2 + ", " + y2 + ") " + result + " Centered at (0,0) with a Height of 5 and "
				+ "a with of 10");

		input.close();
	}

}
