package chapters.chapter_3.exercises;

import java.util.Scanner;

public class C03E08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the three different integer numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a > b) {
			int temp1 = a;
			a = b;
			b = temp1;
		}

		if (b > c) {
			int temp2 = b;
			b = c;
			c = temp2;
		}

		if (a > b) {
			int temp3 = a;
			a = b;
			b = temp3;

		}
		System.out.println(a + " < " + b + " < " + c);

		input.close();

	}

}
