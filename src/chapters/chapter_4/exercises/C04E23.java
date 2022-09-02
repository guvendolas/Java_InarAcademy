package chapters.chapter_4.exercises;

import java.util.Scanner;

public class C04E23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		System.out.println("Enter number oh hours worked in a week:");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double rate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double fTax = input.nextDouble();
		System.out.println("enter state tax withholding rate:");
		double sTax = input.nextDouble();

		System.out.println("Employee Name:" + name);
		System.out.println("Hours Worked:" + hours);
		System.out.println("Pay Rate: $" + rate);
		System.out.println("Gross Pay: $" + rate * hours);
		System.out.println("Deduction:");
		System.out.printf("Federal Withholding (%.1f%%): $%.2f\n", fTax * 100, fTax * rate * hours);
		System.out.printf("State Withholding (%.1f%%): $%.2f\n", sTax * 100, sTax * rate * hours);
		System.out.printf("Total Deduction: $%.2f\n", (sTax + fTax) * rate * hours);
		System.out.printf("Net Pay: $%.2f\n", (1 - sTax - fTax) * rate * hours);
		input.close();
	}

}
