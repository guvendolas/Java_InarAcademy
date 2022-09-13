package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the initial deposit amount: ");
		double saving = input.nextDouble();
		System.out.println("Enter annual percentage yield: ");
		double interest = input.nextDouble();
		interest /= 12 * 100;
		System.out.println("Enter the number of months: ");
		double noOfMonths = input.nextDouble();
		
		System.out.printf("%7s%12s\n", "Month", "CD value");
		
		for (int i = 1; i <= noOfMonths; i++) {
			saving = saving * ( 1 + interest);
			System.out.printf("%4d%12.2f\n", i , saving);
		}
	}

}
