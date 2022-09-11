package chapters.chapter_5.exercises;

public class C05E23 {

	public static void main(String[] args) {

		double rightAns = 0;

		for (double i = 50000.0; i >= 1.0; i--) {
			rightAns += (1 / i);
		}
		System.out.println("The result of adding 1/50,000 + 1/49,999 + ... + 1/1 = " + rightAns);
	}
}
