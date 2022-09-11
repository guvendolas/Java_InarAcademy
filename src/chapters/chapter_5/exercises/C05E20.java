package chapters.chapter_5.exercises;

public class C05E20 {

	public static void main(String[] args) {
		int upperBound = 1000;
	    int perLine = 8;
	    int count = 0;
	    int number = 2;
	 
	    System.out.println("The prime numbers in from 2 to 1000 are");
	 
	    while (number <= upperBound) {
	      boolean isPrime = true;
	 
	      for (int divisor = 2; divisor <= number / 2; divisor++) {
	        if (number % divisor == 0) {
	          isPrime = false;          
	          break;
	        }
	      }
	 
	      if (isPrime) {
	        count++;
	 
	        if (count % perLine == 0) {
	          System.out.println(number);
	        }
	        else
	          System.out.print(number + " ");
	      }
	 
	      number++;
}
}
}
