package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E06 {
	public static void main(String[] args) {
		int number;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		number = input.nextInt();
		
		sum = sum + (number % 10);
		number = number / 10;
		
		sum = sum + (number % 10);
		number = number /10;
		
		sum = sum + (number % 10);
		
		System.out.println("The sum of all digits is " + sum);
		
		input.close();
		
		
		
	}
	

}
