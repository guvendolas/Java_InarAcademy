package chapters.chapter_2.exercises;
import java.util.Scanner;


public class C02E01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double celcius;
		double fahrenheit;
		
		System.out.print("Enter a degree in Celcius: ");
		celcius = input.nextDouble();
		
		System.out.println("The celcius is " + celcius);
		
		fahrenheit = (9.0 / 5.0) * celcius + 32;
		
		System.out.print(celcius + " celcius is " + fahrenheit + " fahrenheit.");
		
		input.close();
		
		
		
		
	}
	
}
