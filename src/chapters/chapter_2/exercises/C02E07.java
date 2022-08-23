package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int minutes;
		int year;
		int days;
		int hours;
		int minutesLeft;
		
		System.out.print("Enter he number of minutes: ");
		
		minutes = input.nextInt();
		
		hours = minutes / 60;
		days = hours / 24;
		year = days / 365;
		days = days % 365;
		minutesLeft = minutes % 60;
		
		
		System.out.println(minutes + " minutes is apporoximantely " + year + " years " + days + " days " + hours + " hours and " + minutesLeft + " minutes. ");
		
		input.close();
		
		
	}

}
