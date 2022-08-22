package chapters.chapter_2.exercises;
import java.util.Scanner;

public class C02E05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double subtotal;
		double gratuityRate;
		double gratuity;
		double total;
		
		System.out.print("Enter the subtotal: ");
		subtotal = input.nextDouble();
		
		System.out.print("\nEnter the gratuity rate: ");
		gratuityRate = input.nextDouble() / 100;
		
		gratuity = subtotal * gratuityRate;
	    total = gratuity + subtotal;
	    
	    
	    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total + ".");
	    
	    input.close();
	    
		
		
	}

}
