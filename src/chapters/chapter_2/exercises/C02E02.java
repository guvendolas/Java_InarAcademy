package chapters.chapter_2.exercises;

import java.util.Scanner;

public class C02E02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double radius;
		double length;
		double PI = Math.PI;
		double Area;
		double Volume;
		
		
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		System.out.print("Enter the length: ");
		length = input.nextDouble();
		
		Area = radius * radius * PI;
		Volume = Area * length;
				
		
		System.out.print("Area = " + Area + "\nVolume = " + Volume);
		
		input.close();
            
	}

}
