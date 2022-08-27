package weeks.week_03;

import java.util.Scanner;

public class Assignment_3E_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three age");

		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();

		if (age1 < age2) {
			int tempAge = age2;
			age2 = age1;
			age1 = tempAge;

		}
		if (age1 < age3) {
			int tempAge = age3;
			age3 = age1;
			age1 = tempAge;
		}
		if (age2 < age3) {
			int tempAge = age3;
			age3 = age2;
			age2 = tempAge;
		}
		System.out.println("yaslarin siralamasi " + age1 + " > " + age2 + " > " + age3);
		input.close();
	}

}
