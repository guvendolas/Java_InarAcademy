package chapters.chapter_4.exercises;

public class C04E25 {

	public static void main(String[] args) {
		char letter1 = (char) ((int) (Math.random() * 26 + 65));
		char letter2 = (char) ((int) (Math.random() * 26 + 65));
		char letter3 = (char) ((int) (Math.random() * 26 + 65));

		int numbers = (int) (Math.random() * 10000);

		String sNumbers = String.format("%04d", numbers);

		System.out.println("The plate number is " + letter1 + letter2 + letter3 + sNumbers);

	}

}
