package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r1 rectangle center x-, y-coordinates, width, and height, respectively:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width_1 = input.nextDouble();
		double height_1 = input.nextDouble();
		System.out.println("Enter r2 rectangle center x-, y-coordinates, width, and height, respectively:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width_2 = input.nextDouble();
		double height_2 = input.nextDouble();
		
		double w1 = width_1 / 2;
		double w2 = width_2 / 2;
		double h1 = height_1 / 2;
		double h2 = height_2 / 2;
		if (x1 == x2 && y1 == y2 && w1 == w2 && h1 == h2) {
			System.out.println("Two rectangle are the same.");
		} else if (y1 - h1 <= y2 - h2 && y1 + h1 >= y2 + h2 && x1 - w1 <= x2 - w2 && x1 + w1 >= x2 + w2) {
			System.out.println("The r2 rectangle is inside the r1 rectangle");
		} else if (y2 - h2 <= y1 - h1 && y2 + h2 >= y1 + h1 && x2 - w2 <= x1 - w1 && x2 + w2 >= x1 + w1) {
			System.out.println("The r1 rectangle is inside the r2 rectangle");
		} else if (y2 + h2 < y1 - h1 || x2 + w2 < x1 - w1 || x2 - w2 > x1 + w1 || y2 - h2 > y1 + h1) {
			System.out.println("The r2 rectangle is out of the r1 rectangle");
		} else {
			System.out.println("Rectangles  are overlap");
		}
		input.close();

	}

}
