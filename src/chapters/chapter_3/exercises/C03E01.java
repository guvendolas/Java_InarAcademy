package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		
		double a;
		double b;
		double c;
		
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		double discriminant = (b * b) - (4 * a * c);
		
		if (discriminant < 0) {
			System.out.println("The discriminant is negative, the equation has no real roots. ");
		} else if (discriminant > 0) {
			double r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
			double r2 = ((-1 * b) - Math.pow(discriminant, 0.5)) / (2 * a);
			
			System.out.println("Two real roots: " + r1 + "," + r2);
			
		} else {
			double r = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.println("One real root: " + r);
		}
		
		input.close();
	}

}
