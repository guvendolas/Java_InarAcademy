package chapters.chapter_5.exercises;

public class C05E03 {

	public static void main(String[] args) {
		int end = 199;
		System.out.printf("%9s%15s\n", "kilograms", "pounds");

		for (int i = 1; i <= end; i++) {
			System.out.printf("%-9d%15.1f\n", i, i * 2.2);

		}
	}

}
