package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pounds;
		double kilometers;
		
		System.out.print("Enter a number in pounds: ");
		pounds = input.nextDouble();
		kilometers = pounds * 0.454;
		
		System.out.print(pounds + " is " + kilometers + " kilometers. ");
		
		input.close();

	}

}
