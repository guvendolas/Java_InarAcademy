package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double acceleration;
		double velocity;
		double length;
		
		System.out.println("Enter the speed: ");
		velocity = input.nextDouble();
		
		System.out.println("Enter the acceleration: ");
		acceleration = input.nextDouble();
		
		length = (Math.pow(velocity, 2) / (acceleration * 2));
		
		System.out.println("The minimum runway length for this airplane is " + (int)(length * 100) / 100.0 );
		
		input.close();

	}

}
