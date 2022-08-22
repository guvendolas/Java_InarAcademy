package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double feet;
		double meter;
		
		System.out.print("Enter the value in feet: ");
		feet = input.nextDouble();
		meter = feet * 0.305;
		
		System.out.print(feet + " feet is " + meter + " meter.");
		
		input.close();

	}

}
