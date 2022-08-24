package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		double first = (3 * Math.pow(3, 0.5)) / 2;
		double result = first * Math.pow(side, 2);
		
		System.out.println("The area of hexagon is " + result);
		
		input.close();
		
	}

}
