package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int a = input.nextInt();
		String b = "";
		
		while (a != 0) {
			b = a % 2 + b;
			a = a / 2;
		}
		System.out.println(b);
	}

}
