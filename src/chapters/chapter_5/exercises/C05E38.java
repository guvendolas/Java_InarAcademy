package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a = input.nextInt();
		String b = "";
		
		while (a != 0) {
			b = a % 8 + b;
			a /= 8;
		}
		System.out.println(b);
	}

}
