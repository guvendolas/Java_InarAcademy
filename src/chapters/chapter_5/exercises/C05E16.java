package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		for (int i = 2; number / i != 1;) {
			if(number % i == 0) {
				System.out.print(i + ",");
				number = number / i;
			} else {
				i++;
			}
		}
		System.out.println(number);
	}

}
