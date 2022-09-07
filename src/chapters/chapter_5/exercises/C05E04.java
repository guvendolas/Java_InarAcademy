package chapters.chapter_5.exercises;

public class C05E04 {

	public static void main(String[] args) {
		int end = 10;

		System.out.println("Mil               kilometers");

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%-15d%6.1f\n", i, (i * 1.609));

		}
	}

}
