package chapters.chapter_5.exercises;

import java.util.Scanner;

public class C05E45 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  System.out.print("Enter ten numbers:");
		  double sum = 0;
		  double sumsq = 0;
		 
		  for (int i = 0; i < 10; i++) {
		   double n = input.nextDouble();
		   sum += n;
		   sumsq += Math.pow(n, 2);
		 
		  }
		 
		  System.out.println("The mean is " + sum / 10);
		  System.out.println("The standard deviation is "
		    + Math.sqrt(((sumsq - Math.pow(sum, 2) / 10))/9));
	}

}
